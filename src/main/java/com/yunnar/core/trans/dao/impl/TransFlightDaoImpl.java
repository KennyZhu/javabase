package com.yunnar.core.trans.dao.impl;

import com.google.inject.Singleton;
import com.yunnar.core.framework.dao.BaseDao;
import com.yunnar.core.trans.dao.TransFlightDao;
import com.yunnar.core.trans.model.TransFlight;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Desc:
 * <p/>Date: 2014/7/29
 */
@Singleton
public class TransFlightDaoImpl extends BaseDao implements TransFlightDao {

    @Override
    public List<TransFlight> getListByUid(long memberId, int offset, int limit) {
        return selectList("getListByUid", memberId, new RowBounds(offset, limit));
    }
}
