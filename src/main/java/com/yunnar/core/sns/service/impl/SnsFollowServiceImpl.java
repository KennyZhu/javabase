package com.yunnar.core.sns.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.yunnar.core.sns.dao.SnsFollowDao;
import com.yunnar.core.sns.model.SnsFollow;
import com.yunnar.core.sns.service.SnsFollowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 11:41
 */
@Singleton
public class SnsFollowServiceImpl implements SnsFollowService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SnsFollowServiceImpl.class);

    @Inject
    private SnsFollowDao snsFollowDao;

    @Override
    public int follow(SnsFollow follow) {
        if (follow == null) {
            return 0;
        }
        if (follow.getUid() == follow.getFollowUid()) {
            LOGGER.error("Uid can not equals follow uid!");
            return 0;
        }
        return snsFollowDao.insert(follow);
    }

    @Override
    public int unFollow(int followId) {
        if (followId == 0) {
            return 0;
        }
        return snsFollowDao.delete(followId);
    }

    @Override
    public List<SnsFollow> getFollowListByUid(long uid) {
        if (uid == 0) {
            return Collections.EMPTY_LIST;
        }
        return snsFollowDao.getListByUid(uid);
    }

    @Override
    public List<Long> getFollowUidListByUid(long uid, int page, int pageSize) {
        if (uid == 0 || page <= 0 || pageSize <= 0) {
            return Collections.emptyList();
        }
        return snsFollowDao.getFollowUidListByUid(uid, (page - 1) * pageSize, pageSize);
    }

    @Override
    public boolean addFollow(long uid, long followUid) {
        if (uid == followUid) {
            LOGGER.error("Uid can not equals follow uid!");
            return false;
        }
        SnsFollow snsFollow = new SnsFollow();
        snsFollow.setUid(uid);
        snsFollow.setFollowUid(followUid);
        return this.follow(snsFollow) == 1 ? true : false;
    }

    @Override
    public boolean removeFollow(long uid, long followUid) {
        if (uid == followUid) {
            LOGGER.error("Uid can not equals follow uid!");
            return false;
        }
        return snsFollowDao.deleteByUidFollowUid(uid, followUid) == 1 ? true : false;
    }

    @Override
    public int getTotalFollowedCountByUid(long uid) {
        if (uid == 0) {
            return 0;
        }
        return snsFollowDao.getTotalFollowedCountByUid(uid);
    }
}
