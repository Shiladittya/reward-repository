package com.wtw.reward.enums;

public enum EventEnum {
	ENROLLMENT(1), 
	PURCHASE(2), 
	REFERRAL(3), 
	REDEEM(4), 
	TOPUP(5), 
	RENEWAL(6);

	private Integer eventId;

	private EventEnum(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getEventId() {
		return eventId;
	}

}
