package com.zkenny.core.common.service;

/**
 * Desc:
 * <p/>Date: 2015/5/7
 * <br/>Time: 16:46
 * <br/>User: ylzhu
 */
public interface HttpService {

    public String sendRequest(String url, int connectTimeout, int readTimeout, String charset);
}
