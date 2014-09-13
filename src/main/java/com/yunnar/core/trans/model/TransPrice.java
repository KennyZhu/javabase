package com.yunnar.core.trans.model;

/**
 * User: KennyZhu
 * Date: 14-7-29
 * Desc:
 */
public class TransPrice {
    private Long id;
    private Integer lineNo;
    /**
     * 承运能力
     */
    private String carryCapacity;
    private Long transUnit;
    private Double transPrice;
    private Long currencyId;
    private Double discount;
    private Long flightId;

    /**
     * default constructor
     */
    public TransPrice() {
    }

    /**
     * full constructor
     */
    public TransPrice(Integer lineNo, String carryCapacity, Long transUnit, Double transPrice, Long currencyId, Double discount,
                      Long flightId) {
        this.lineNo = lineNo;
        this.carryCapacity = carryCapacity;
        this.transUnit = transUnit;
        this.transPrice = transPrice;
        this.currencyId = currencyId;
        this.discount = discount;
        this.flightId = flightId;
    }

    // Property accessors

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLineNo() {
        return this.lineNo;
    }

    public void setLineNo(Integer lineNo) {
        this.lineNo = lineNo;
    }

    public String getCarryCapacity() {
        return this.carryCapacity;
    }

    public void setCarryCapacity(String carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public Long getTransUnit() {
        return this.transUnit;
    }

    public void setTransUnit(Long transUnit) {
        this.transUnit = transUnit;
    }

    public Double getTransPrice() {
        return this.transPrice;
    }

    public void setTransPrice(Double transPrice) {
        this.transPrice = transPrice;
    }

    public Long getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Double getDiscount() {
        return this.discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Long getFlightId() {
        return this.flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }
}
