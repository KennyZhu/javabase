package com.zkenny.core.common.util;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc:
 * <p/>Date: 2015/5/7
 * <br/>Time: 16:39
 * <br/>User: ylzhu
 */
public final class JsonUtil {
    /**
     * Json类型转换为Map类型
     *
     * @param jsonStr
     * @return
     */
    public static Map<String, Object> jsonToMap(String jsonStr) {
        JSONObject jsonObj = JSONObject.fromObject(jsonStr);
        return (Map<String, Object>) JsonUtil.parseJSONObj(jsonObj);
    }

    /**
     * 递归地将JSONArray转换为List对象，将JSONObject转换为Map对象
     *
     * @param obj
     * @return
     */
    private static Object parseJSONObj(Object obj) {

        Object result = null;
        if (obj == null) {
            // error
            return null;
        } else {
            if (obj instanceof JSONArray) {
                JSONArray arrayObj = (JSONArray) obj;
                List<Object> list = new ArrayList<Object>();
                for (Object element : arrayObj.toArray()) {
                    list.add(JsonUtil.parseJSONObj(element));
                }
                result = list;
            } else if (obj instanceof JSONObject) {
                JSONObject jsonObj = (JSONObject) obj;
                Map<String, Object> map = new HashMap<String, Object>();
                for (Object key : jsonObj.keySet()) {
                    map.put(key.toString(), JsonUtil.parseJSONObj(jsonObj.get(key.toString())));
                }
                return map;
            } else {
                result = obj;
            }
        }
        return result;
    }
}
