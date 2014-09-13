package com.yunnar.core.common.test;

import com.google.inject.Injector;
import com.yunnar.core.common.test.model.Place;
import com.yunnar.core.common.test.service.PlaceService;
import com.yunnar.core.framework.common.GuiceHolder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 12:48
 */
public class PlaceServiceTest {

    private static final Injector injector = GuiceHolder.getInstance().getInjector();
    private PlaceService service = injector.getInstance(PlaceService.class);
    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceServiceTest.class);

    @Test
    public void getByTitleEn() {
        Place place = service.getByTitleEn("SHANGHAI");
        LOGGER.info("######Place title is {}", place == null ? "empty" : place.getTitle());

    }
}
