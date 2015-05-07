package com.zkenny.core.third.service.impl;

import com.zkenny.core.common.constant.CommonConstant;
import com.zkenny.core.common.util.JsonUtil;
import com.zkenny.core.third.bean.AccessTokenWrapper;
import com.zkenny.core.third.constant.ThirdLoginConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Desc:
 * <p/>Date: 2015/3/4
 * <br/>Time: 16:08
 * <br/>User: Kenny Zhu
 */
@Service("qqInfoWrapper")
public class QQInfoWrapper extends DefaultThirdPlatformInfoWrapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(QQInfoWrapper.class);

    public String getNickName(AccessTokenWrapper accessToken) {
        String nickName = "QQ用户";
        String getUserInfoUrl = "https://graph.qq.com/user/get_user_info" + "?access_token="
                + accessToken.getAccessToken() + "&oauth_consumer_key=" + ThirdLoginConstant.QQ_APP_ID + "&openid="
                + accessToken.getOpenId();

        try {
            String resultJson = httpService.sendRequest(getUserInfoUrl, 10000, 10000, CommonConstant.CHAR_SET_UTF8);
            LOGGER.info("#Get QQ nickname:Send getUserInfoUrl is :" + getUserInfoUrl + " return  " + resultJson);
            Map<String, Object> resultMap = JsonUtil.jsonToMap(resultJson);
            if (resultMap.get("nickname") != null) {
                nickName = String.valueOf(resultMap.get("nickname"));
            } else {
                LOGGER.error("#Get QQ nickname:Send getUserInfoUrl is :" + getUserInfoUrl + " return  " + resultJson);
            }
        } catch (Exception e) {
            LOGGER.error("QQ Login Error:Cause:", e);
        }

        return nickName;
    }
}
