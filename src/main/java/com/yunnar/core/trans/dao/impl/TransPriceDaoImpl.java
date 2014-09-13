package com.yunnar.core.trans.dao.impl;

import com.google.inject.Singleton;
import com.yunnar.core.framework.dao.BaseDao;
import com.yunnar.core.trans.dao.TransPriceDao;
import com.yunnar.core.trans.model.TransPrice;

import java.util.List;

/**
 * User: KennyZhu
 * Date: 14-7-30
 * Desc:
 */
@Singleton
public class TransPriceDaoImpl extends BaseDao implements TransPriceDao {

    @Override
    public List<TransPrice> getListByFlightId(long flightId) {
        return selectList("getListByFlightId", flightId);
    }
}
