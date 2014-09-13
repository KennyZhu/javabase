package com.yunnar.core.trans.dao;

import com.google.inject.ImplementedBy;
import com.yunnar.core.trans.dao.impl.TransPriceDaoImpl;
import com.yunnar.core.trans.model.TransPrice;

import java.util.List;

/**
 * User: KennyZhu
 * Date: 14-7-30
 * Desc:
 */
@ImplementedBy(TransPriceDaoImpl.class)
public interface TransPriceDao {

    public List<TransPrice> getListByFlightId(long flightId);
}
