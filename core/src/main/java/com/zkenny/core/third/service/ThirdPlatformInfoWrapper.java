package com.zkenny.core.third.service;

import com.zkenny.core.third.bean.AccessTokenWrapper;

/**
 * Desc:
 * <p/>Date: 2015/3/4
 * <br/>Time: 16:06
 * <br/>User: Kenny Zhu
 */
public interface ThirdPlatformInfoWrapper {
    /**
     * 获取昵称
     *
     * @return
     */
    String getNickName(AccessTokenWrapper accessToken);
}
