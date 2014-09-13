package com.yunnar.core.trans;

import com.google.inject.Injector;
import com.yunnar.core.framework.common.GuiceHolder;
import com.yunnar.core.trans.service.TransService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: KennyZhu
 * Date: 14-7-30
 * Desc:
 */
public class TransServiceTest {

    private static final Injector INJECTOR = GuiceHolder.getInstance().getInjector();
    private TransService service = INJECTOR.getInstance(TransService.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(TransServiceTest.class);

    @Test
    public void getTransFlightListByUid() {
        long memberUid = 40;

        int page = 1;
        int pageSize = 5;
        LOGGER.info("return :{}", service.getTransFlightListByUid(memberUid, page, pageSize));

    }

    @Test
    public void getPriceListByFlightId() {

        long flightId = 482;
        LOGGER.info("return :{}", service.getTransPriceListByFlightId(flightId));
    }
}
