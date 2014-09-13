package com.yunnar.core.common.test.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.yunnar.core.common.test.dao.PlaceDao;
import com.yunnar.core.common.test.model.Place;
import com.yunnar.core.common.test.service.PlaceService;
import org.apache.commons.lang3.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 17:58
 */
@Singleton
public class PlaceServiceImpl implements PlaceService {
    @Inject
    private PlaceDao placeDao;

    @Override
    public Place getByTitleEn(String titleEn) {
        if (StringUtils.isBlank(titleEn)) {
            return null;
        }
        return placeDao.getByTitleEn(titleEn);
    }
}
