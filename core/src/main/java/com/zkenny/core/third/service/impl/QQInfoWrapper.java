package com.zkenny.core.third.service.impl;

import com.zkenny.core.third.service.ThirdPlatformInfoWrapper;
import org.springframework.stereotype.Service;

/**
 * Desc:
 * <p/>Date: 2015/3/4
 * <br/>Time: 16:08
 * <br/>User: Kenny Zhu
 */
@Service("qqInfoWrapper")
public class QQInfoWrapper implements ThirdPlatformInfoWrapper {
    @Override
    public String getNickName() {
        return null;
    }
}
