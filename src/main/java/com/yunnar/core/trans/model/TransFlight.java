package com.yunnar.core.trans.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Desc:
 * <p/>Date: 2014/7/29
 * <br/>User: KennyZhu
 */
public class TransFlight
{

	private Long flightId;
	/**
	 * 运输类型
	 */
	private String transType;
	/**
	 * 装运地
	 */
	private String pol;
	/**
	 * 目的地
	 */
	private String pod;
	private Integer transTimeDay;
	private Integer transTimeHour;
	private Date endDate;
	private String flightNo;
	/**
	 * 有效期
	 */
	private Integer effectiveDay;
	private Date effectiveDate;
	private Long pubCarrierId;
	/**
	 * 运输能力
	 */
	private String carryCapacity;
	private Long transUnit;
	private Timestamp publishTime;
	private Long memberId;
	private String auditFlag;
	private String recommendFlag;
	private String vipFlag;
	private String preferentialFlag;
	private String isForeign;
	private String remark;
	private Timestamp recommendTodayDate;
	private String scheduleMonday;
	private String scheduleTuesday;
	private String scheduleWednesday;
	private String scheduleThursday;
	private String scheduleFriday;
	private String scheduleSaturday;
	private String scheduleSunday;

	// Constructors

	/**
	 * default constructor
	 */
	public TransFlight()
	{
	}

	/**
	 * minimal constructor
	 */
	public TransFlight(Timestamp publishTime)
	{
		this.publishTime = publishTime;
	}

	/**
	 * full constructor
	 */
	public TransFlight(String transType, String pol, String pod, Integer transTimeDay, Integer transTimeHour,
			Date endDate, String flightNo, Integer effectiveDay, Date effectiveDate, Long pubCarrierId,
			String carryCapacity, Long transUnit, Timestamp publishTime, Long memberId, String auditFlag,
			String recommendFlag, String vipFlag, String preferentialFlag, String isForeign, String remark,
			Timestamp recommendTodayDate, String scheduleMonday, String scheduleTuesday, String scheduleWednesday,
			String scheduleThursday, String scheduleFriday, String scheduleSaturday, String scheduleSunday)
	{
		this.transType = transType;
		this.pol = pol;
		this.pod = pod;
		this.transTimeDay = transTimeDay;
		this.transTimeHour = transTimeHour;
		this.endDate = endDate;
		this.flightNo = flightNo;
		this.effectiveDay = effectiveDay;
		this.effectiveDate = effectiveDate;
		this.pubCarrierId = pubCarrierId;
		this.carryCapacity = carryCapacity;
		this.transUnit = transUnit;
		this.publishTime = publishTime;
		this.memberId = memberId;
		this.auditFlag = auditFlag;
		this.recommendFlag = recommendFlag;
		this.vipFlag = vipFlag;
		this.preferentialFlag = preferentialFlag;
		this.isForeign = isForeign;
		this.remark = remark;
		this.recommendTodayDate = recommendTodayDate;
		this.scheduleMonday = scheduleMonday;
		this.scheduleTuesday = scheduleTuesday;
		this.scheduleWednesday = scheduleWednesday;
		this.scheduleThursday = scheduleThursday;
		this.scheduleFriday = scheduleFriday;
		this.scheduleSaturday = scheduleSaturday;
		this.scheduleSunday = scheduleSunday;
	}

	// Property accessors

	public Long getFlightId()
	{
		return this.flightId;
	}

	public void setFlightId(Long flightId)
	{
		this.flightId = flightId;
	}

	public String getTransType()
	{
		return this.transType;
	}

	public void setTransType(String transType)
	{
		this.transType = transType;
	}

	public String getPol()
	{
		return this.pol;
	}

	public void setPol(String pol)
	{
		this.pol = pol;
	}

	public String getPod()
	{
		return this.pod;
	}

	public void setPod(String pod)
	{
		this.pod = pod;
	}

	public Integer getTransTimeDay()
	{
		return this.transTimeDay;
	}

	public void setTransTimeDay(Integer transTimeDay)
	{
		this.transTimeDay = transTimeDay;
	}

	public Integer getTransTimeHour()
	{
		return this.transTimeHour;
	}

	public void setTransTimeHour(Integer transTimeHour)
	{
		this.transTimeHour = transTimeHour;
	}

	public Date getEndDate()
	{
		return this.endDate;
	}

	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}

	public String getFlightNo()
	{
		return this.flightNo;
	}

	public void setFlightNo(String flightNo)
	{
		this.flightNo = flightNo;
	}

	public Integer getEffectiveDay()
	{
		return this.effectiveDay;
	}

	public void setEffectiveDay(Integer effectiveDay)
	{
		this.effectiveDay = effectiveDay;
	}

	public Date getEffectiveDate()
	{
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate)
	{
		this.effectiveDate = effectiveDate;
	}

	public Long getPubCarrierId()
	{
		return this.pubCarrierId;
	}

	public void setPubCarrierId(Long pubCarrierId)
	{
		this.pubCarrierId = pubCarrierId;
	}

	public String getCarryCapacity()
	{
		return this.carryCapacity;
	}

	public void setCarryCapacity(String carryCapacity)
	{
		this.carryCapacity = carryCapacity;
	}

	public Long getTransUnit()
	{
		return this.transUnit;
	}

	public void setTransUnit(Long transUnit)
	{
		this.transUnit = transUnit;
	}

	public Timestamp getPublishTime()
	{
		return this.publishTime;
	}

	public void setPublishTime(Timestamp publishTime)
	{
		this.publishTime = publishTime;
	}

	public Long getMemberId()
	{
		return this.memberId;
	}

	public void setMemberId(Long memberId)
	{
		this.memberId = memberId;
	}

	public String getAuditFlag()
	{
		return this.auditFlag;
	}

	public void setAuditFlag(String auditFlag)
	{
		this.auditFlag = auditFlag;
	}

	public String getRecommendFlag()
	{
		return this.recommendFlag;
	}

	public void setRecommendFlag(String recommendFlag)
	{
		this.recommendFlag = recommendFlag;
	}

	public String getVipFlag()
	{
		return this.vipFlag;
	}

	public void setVipFlag(String vipFlag)
	{
		this.vipFlag = vipFlag;
	}

	public String getPreferentialFlag()
	{
		return this.preferentialFlag;
	}

	public void setPreferentialFlag(String preferentialFlag)
	{
		this.preferentialFlag = preferentialFlag;
	}

	public String getIsForeign()
	{
		return this.isForeign;
	}

	public void setIsForeign(String isForeign)
	{
		this.isForeign = isForeign;
	}

	public String getRemark()
	{
		return this.remark;
	}

	public void setRemark(String remark)
	{
		this.remark = remark;
	}

	public Timestamp getRecommendTodayDate()
	{
		return this.recommendTodayDate;
	}

	public void setRecommendTodayDate(Timestamp recommendTodayDate)
	{
		this.recommendTodayDate = recommendTodayDate;
	}

	public String getScheduleMonday()
	{
		return this.scheduleMonday;
	}

	public void setScheduleMonday(String scheduleMonday)
	{
		this.scheduleMonday = scheduleMonday;
	}

	public String getScheduleTuesday()
	{
		return this.scheduleTuesday;
	}

	public void setScheduleTuesday(String scheduleTuesday)
	{
		this.scheduleTuesday = scheduleTuesday;
	}

	public String getScheduleWednesday()
	{
		return this.scheduleWednesday;
	}

	public void setScheduleWednesday(String scheduleWednesday)
	{
		this.scheduleWednesday = scheduleWednesday;
	}

	public String getScheduleThursday()
	{
		return this.scheduleThursday;
	}

	public void setScheduleThursday(String scheduleThursday)
	{
		this.scheduleThursday = scheduleThursday;
	}

	public String getScheduleFriday()
	{
		return this.scheduleFriday;
	}

	public void setScheduleFriday(String scheduleFriday)
	{
		this.scheduleFriday = scheduleFriday;
	}

	public String getScheduleSaturday()
	{
		return this.scheduleSaturday;
	}

	public void setScheduleSaturday(String scheduleSaturday)
	{
		this.scheduleSaturday = scheduleSaturday;
	}

	public String getScheduleSunday()
	{
		return this.scheduleSunday;
	}

	public void setScheduleSunday(String scheduleSunday)
	{
		this.scheduleSunday = scheduleSunday;
	}

	@Override
	public String toString()
	{
		return "TransFlight{" + "flightId=" + flightId + ", transType='" + transType + '\'' + ", pol='" + pol + '\''
				+ ", pod='" + pod + '\'' + ", transTimeDay=" + transTimeDay + ", transTimeHour=" + transTimeHour
				+ ", endDate=" + endDate + ", flightNo='" + flightNo + '\'' + ", effectiveDay=" + effectiveDay
				+ ", effectiveDate=" + effectiveDate + ", pubCarrierId=" + pubCarrierId + ", carryCapacity='"
				+ carryCapacity + '\'' + ", transUnit=" + transUnit + ", publishTime=" + publishTime + ", memberId="
				+ memberId + ", auditFlag='" + auditFlag + '\'' + ", recommendFlag='" + recommendFlag + '\''
				+ ", vipFlag='" + vipFlag + '\'' + ", preferentialFlag='" + preferentialFlag + '\'' + ", isForeign='"
				+ isForeign + '\'' + ", remark='" + remark + '\'' + ", recommendTodayDate=" + recommendTodayDate
				+ ", scheduleMonday='" + scheduleMonday + '\'' + ", scheduleTuesday='" + scheduleTuesday + '\''
				+ ", scheduleWednesday='" + scheduleWednesday + '\'' + ", scheduleThursday='" + scheduleThursday + '\''
				+ ", scheduleFriday='" + scheduleFriday + '\'' + ", scheduleSaturday='" + scheduleSaturday + '\''
				+ ", scheduleSunday='" + scheduleSunday + '\'' + '}';
	}
}
