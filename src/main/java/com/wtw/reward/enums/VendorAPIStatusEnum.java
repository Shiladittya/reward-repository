package com.wtw.reward.enums;

public enum VendorAPIStatusEnum {

	SUCCESS(0,"Success"),
	FAILED(1,"Fail");
	
	int resCode;
	String resMessage;

	VendorAPIStatusEnum(int resCode, String resMessage) {
		this.resCode = resCode;
		this.resMessage = resMessage;
	}

	public int getResCode() {
		return resCode;
	}
	
	public String getResMessage() {
		return resMessage;
	}
}
