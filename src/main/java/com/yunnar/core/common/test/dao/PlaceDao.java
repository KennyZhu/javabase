package com.yunnar.core.common.test.dao;

import com.google.inject.ImplementedBy;
import com.yunnar.core.common.test.dao.impl.PlaceDaoImpl;
import com.yunnar.core.common.test.model.Place;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 17:59
 */
@ImplementedBy(PlaceDaoImpl.class)
public interface PlaceDao {
    public Place getByTitleEn(String titleEn);
}
