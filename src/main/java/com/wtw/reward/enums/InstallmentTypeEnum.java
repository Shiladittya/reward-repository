package com.wtw.reward.enums;

public enum InstallmentTypeEnum {

	CASHBACK(1, "Money as a cashback"), 
	POINT(2, "Points as a cashback"), 
	COUPON(3, "Coupon as a cashback");

	private Integer type;

	private String desc;

	private InstallmentTypeEnum(Integer type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public Integer getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

	public static InstallmentTypeEnum getInstallmentEnumByType(Integer type) {
		InstallmentTypeEnum[] allValues = InstallmentTypeEnum.values();

		for (InstallmentTypeEnum value : allValues) {
			if (value.getType().equals(type)) {
				return value;
			}
		}
		
		return null;
	}
	
	public static boolean isCashbackReward(Integer cashbackType) {		
		return cashbackType.equals(InstallmentTypeEnum.CASHBACK.getType());
	}
}
