package com.yunnar.core.sns;

import com.google.inject.Injector;
import com.yunnar.core.framework.common.GuiceHolder;
import com.yunnar.core.sns.model.SnsFollow;
import com.yunnar.core.sns.service.SnsFollowService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: KennyZhu
 * Date: 14-7-26
 * Desc:
 */
public class SnsFollowServiceTest {
    private static final Injector INJECTOR = GuiceHolder.getInstance().getInjector();
    private SnsFollowService service = INJECTOR.getInstance(SnsFollowService.class);

    private static final Logger LOGGER = LoggerFactory.getLogger(SnsFollowServiceTest.class);

    @Test
    public void insert() {
        int size = 20;
        for (int i = 1; i < 27; i++) {
            SnsFollow snsFollow = new SnsFollow();
            snsFollow.setUid(101);
            snsFollow.setFollowUid(i);
            LOGGER.info("Insert follow record return :{}", service.follow(snsFollow));
        }
    }

    @Test
    public void delete() {
        int followId = 1;
        LOGGER.info("Delete follow record return :{}", service.unFollow(followId));
    }

    @Test
    public void getFollowListByUid() {
        long uid = 101;
        LOGGER.info("Get sns follow by uid :{} return :{}", uid, service.getFollowListByUid(uid));
    }

    @Test
    public void deleteByUidFollowUid() {
        long uid = 1;
        long followUid = 3;
        LOGGER.info("Delete by uid :{} followUid:{} return :{}", new Object[]{uid, followUid, service.removeFollow(uid, followUid)});
    }

    @Test
    public void getTotalCountByUid() {
        long uid = 1;
        LOGGER.info("Get total follow count by uid :{} return :{}", uid, service.getTotalFollowedCountByUid(uid));
    }

    @Test
    public void getFollowUidListByUid() {
        int page = 2;
        int pageSize = 5;
        long uid = 101;
        LOGGER.info("Get followUidList by uid :{} return :{}", uid, service.getFollowUidListByUid(uid, page, pageSize));
    }

}
