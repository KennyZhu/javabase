package com.yunnar.core.sns.service;

import com.google.inject.ImplementedBy;
import com.yunnar.core.sns.model.SnsFollow;
import com.yunnar.core.sns.service.impl.SnsFollowServiceImpl;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 11:40
 */
@ImplementedBy(SnsFollowServiceImpl.class)
public interface SnsFollowService {
    /**
     * Add follow
     *
     * @param follow
     * @return
     */
    public int follow(SnsFollow follow);

    /**
     * Undo follow
     *
     * @param followId
     * @return
     */
    public int unFollow(int followId);

    /**
     * Get User's follow List by User's uid
     *
     * @param uid
     * @return
     */
    public List<SnsFollow> getFollowListByUid(long uid);

    /**
     * 分页获取用户关注的承运商UID List
     *
     * @param uid
     * @param page
     * @param pageSize
     * @return
     */
    public List<Long> getFollowUidListByUid(long uid, int page, int pageSize);

    /**
     * 增加关注
     *
     * @param uid
     * @param followUid
     * @return
     */
    public boolean addFollow(long uid, long followUid);

    /**
     * 取消关注
     *
     * @param uid
     * @param followUid
     * @return
     */
    public boolean removeFollow(long uid, long followUid);

    /**
     * 获取用户所有的关注者
     *
     * @param uid
     * @return
     */
    public int getTotalFollowedCountByUid(long uid);

}
