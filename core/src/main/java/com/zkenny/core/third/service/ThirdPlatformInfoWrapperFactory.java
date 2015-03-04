package com.zkenny.core.third.service;

import com.zkenny.core.third.ThirdPlatformEnum;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Desc:
 * <p/>Date: 2015/3/4
 * <br/>Time: 15:47
 * <br/>User: Kenny Zhu
 */
public class ThirdPlatformInfoWrapperFactory implements ApplicationContextAware {

    private static ApplicationContext ctx;

    public ThirdPlatformInfoWrapper getThirdInfoWrapper(ThirdPlatformEnum typeEnum) {
        return (ThirdPlatformInfoWrapper) ctx.getBean(typeEnum.getPlatform() + "InfoWrapper");
    }

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.ctx = ctx;
    }
}
