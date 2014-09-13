package com.yunnar.core.common.test.dao.impl;

import com.google.inject.Singleton;
import com.yunnar.core.common.test.dao.PlaceDao;
import com.yunnar.core.common.test.model.Place;
import com.yunnar.core.framework.dao.BaseDao;

/**
 * Created with IntelliJ IDEA.
 * User: KennyZhu
 * Date: 2014-7-20
 * Time: 17:59
 */
@Singleton
public class PlaceDaoImpl extends BaseDao implements PlaceDao {
    @Override
    public Place getByTitleEn(String titleEn) {
        //return (Place)selectOne("com.yunnar.core.common.test.dao.PlaceDao.getByTitleEn", titleEn);
        return null;
    }
}
