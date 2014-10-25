package com.zkenny.core.third;

/**
 * Desc:第三方登录类型
 * <p/>Date: 2014/10/24
 * <br/>Time: 21:27
 * <br/>User: kennyzhu
 */
public enum ThirdTypeEnum {

    QQ("qq"),
    WeiBo("weibo");
    private String platform;

    private ThirdTypeEnum(String platform) {
        this.platform = platform;
    }

}
