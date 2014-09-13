package com.yunnar.core.sns.dao.impl;

import com.google.inject.Singleton;
import com.yunnar.core.framework.dao.BaseDao;
import com.yunnar.core.sns.dao.SnsFollowDao;
import com.yunnar.core.sns.model.SnsFollow;
import org.apache.ibatis.session.RowBounds;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 11:52
 */
@Singleton
public class SnsFollowDaoImpl extends BaseDao implements SnsFollowDao {
    @Override
    public int insert(SnsFollow snsFollow) {
        return insert("insert", snsFollow);
    }

    @Override
    public int delete(int followId) {
        return delete("delete", followId);
    }

    @Override
    public List<SnsFollow> getListByUid(long uid) {
        return selectList("getListByUid", uid);
    }

    @Override
    public int deleteByUidFollowUid(long uid, long followUid) {
        Map<String, Long> paramMap = new HashMap<>();
        paramMap.put("uid", uid);
        paramMap.put("followUid", followUid);
        return delete("deleteByUidFollowUid", paramMap);
    }

    @Override
    public int getTotalFollowedCountByUid(long uid) {
        return (Integer) selectOne("getTotalFollowedCountByUid", uid);
    }

    @Override
    public List<Long> getFollowUidListByUid(long uid, int offset, int limit) {
        return selectList("getFollowUidListByUid", uid, new RowBounds(offset, limit));
    }
}
