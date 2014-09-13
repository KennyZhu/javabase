package com.yunnar.core.trans.service;

import com.google.inject.ImplementedBy;
import com.yunnar.core.trans.model.TransFlight;
import com.yunnar.core.trans.model.TransPrice;
import com.yunnar.core.trans.service.impl.TransServiceImpl;

import java.util.List;

/**
 * User: KennyZhu
 * Date: 14-7-29
 * Desc:
 */
@ImplementedBy(TransServiceImpl.class)
public interface TransService {
    /**
     * 根据FlightId 获取关联的TransPrice List
     *
     * @param flightId
     * @return
     */
    public List<TransPrice> getTransPriceListByFlightId(long flightId);

    /**
     * @param uid
     * @return
     */
    public List<TransFlight> getTransFlightListByUid(long uid);

    /**
     * 根据用户UID分页获取Flight
     *
     * @param uid
     * @param page
     * @param pageSize
     * @return
     */
    public List<TransFlight> getTransFlightListByUid(long uid, int page, int pageSize);
}
