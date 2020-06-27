package com.wtw.reward.enums;

public enum DeliveryMethodEnum {
	IMMEDIATE(1), 
	SCHEDULED(2);

	private Integer deliveryMethod;

	private DeliveryMethodEnum(Integer deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public Integer getDeliveryMethod() {
		return deliveryMethod;
	}

}
