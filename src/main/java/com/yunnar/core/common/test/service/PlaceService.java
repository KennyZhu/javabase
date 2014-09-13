package com.yunnar.core.common.test.service;

import com.google.inject.ImplementedBy;
import com.yunnar.core.common.test.model.Place;
import com.yunnar.core.common.test.service.impl.PlaceServiceImpl;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 17:57
 */
@ImplementedBy(PlaceServiceImpl.class)
public interface PlaceService {
    public Place getByTitleEn(String titleEn);
}
