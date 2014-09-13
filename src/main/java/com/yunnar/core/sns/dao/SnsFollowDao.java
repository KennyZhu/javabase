package com.yunnar.core.sns.dao;

import com.google.inject.ImplementedBy;
import com.yunnar.core.sns.dao.impl.SnsFollowDaoImpl;
import com.yunnar.core.sns.model.SnsFollow;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 11:52
 */
@ImplementedBy(SnsFollowDaoImpl.class)
public interface SnsFollowDao {
    public int insert(SnsFollow snsFollow);

    public int delete(int followId);

    public List<SnsFollow> getListByUid(long uid);

    public int deleteByUidFollowUid(long uid, long followUid);

    public int getTotalFollowedCountByUid(long uid);

    public List<Long> getFollowUidListByUid(long uid, int offset, int limit);

}
