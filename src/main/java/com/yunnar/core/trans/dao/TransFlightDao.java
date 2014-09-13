package com.yunnar.core.trans.dao;

import com.google.inject.ImplementedBy;
import com.yunnar.core.trans.dao.impl.TransFlightDaoImpl;
import com.yunnar.core.trans.model.TransFlight;

import java.util.List;

/**
 * Desc:
 * <p/>Date: 2014/7/29
 */
@ImplementedBy(TransFlightDaoImpl.class)
public interface TransFlightDao {
    public List<TransFlight> getListByUid(long memberId, int offset, int limit);
}
