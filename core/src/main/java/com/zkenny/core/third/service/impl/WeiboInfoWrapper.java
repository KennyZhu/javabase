package com.zkenny.core.third.service.impl;

import com.zkenny.core.third.bean.AccessTokenWrapper;
import org.springframework.stereotype.Service;

/**
 * Desc:微博信息
 * <p/>Date: 2015/3/4
 * <br/>Time: 16:11
 * <br/>User: Kenny Zhu
 */
@Service("weiboInfoWrapper")
public class WeiboInfoWrapper extends DefaultThirdPlatformInfoWrapper {
    @Override
    public String getNickName(AccessTokenWrapper accessToken) {
        return null;
    }
}
