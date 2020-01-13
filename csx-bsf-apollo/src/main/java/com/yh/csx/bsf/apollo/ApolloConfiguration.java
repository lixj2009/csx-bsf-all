package com.yh.csx.bsf.apollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.yh.csx.bsf.core.config.BsfConfiguration;
import com.yh.csx.bsf.core.util.LogUtils;
import com.yh.csx.bsf.core.util.PropertyUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author:
 * @version: 2019-05-28 09:26
 **/
@Configuration
@ConditionalOnProperty(name = "bsf.apollo.enabled", havingValue = "true")
@Import(BsfConfiguration.class)
@EnableApolloConfig //{"bsf","application"}
public class ApolloConfiguration implements InitializingBean  {

    @Override
    public void afterPropertiesSet()
    {
        LogUtils.info(ApolloConfiguration.class,ApolloProperties.Project,"已启动!!!"+" "+ApolloProperties.ApolloMeta+"="+ PropertyUtils.getPropertyCache(ApolloProperties.ApolloMeta,""));
    }

}
