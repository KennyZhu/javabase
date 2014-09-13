package com.yunnar.core.trans.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.yunnar.core.trans.dao.TransFlightDao;
import com.yunnar.core.trans.dao.TransPriceDao;
import com.yunnar.core.trans.model.TransFlight;
import com.yunnar.core.trans.model.TransPrice;
import com.yunnar.core.trans.service.TransService;

import java.util.Collections;
import java.util.List;

/**
 * User: KennyZhu
 * Date: 14-7-29
 * Desc:
 */
@Singleton
public class TransServiceImpl implements TransService {

    @Inject
    private TransFlightDao flightDao;
    @Inject
    private TransPriceDao priceDao;


    @Override
    public List<TransPrice> getTransPriceListByFlightId(long flightId) {
        if (flightId < 0) {
            return Collections.EMPTY_LIST;
        }
        return priceDao.getListByFlightId(flightId);
    }

    @Override
    public List<TransFlight> getTransFlightListByUid(long uid) {
        return null;
    }

    @Override
    public List<TransFlight> getTransFlightListByUid(long uid, int page, int pageSize) {
        if (uid == 0 || page <= 0 || pageSize <= 0) {
            return Collections.emptyList();
        }
        return flightDao.getListByUid(uid, (page - 1) * pageSize, pageSize);
    }
}
