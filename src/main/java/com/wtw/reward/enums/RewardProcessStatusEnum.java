package com.wtw.reward.enums;

public enum RewardProcessStatusEnum {

	PENDING(0, "When transaction is just initiated and is valid only for scheduled transaction"), 
	DUE(1, "When transaction is eligible for execution"), 
	IN_PROCESS(2, "When transaction has started its execution"), 
	PROCESSED(3, "Installment is processed successfully"),
	SUCCESS(4, "When transaction has completed its execution successfully"),
	FAILED(5, "An error has occurred during execution. It will re-try again after sometime");

	private Integer statusId;

	private String statusDesc;

	private RewardProcessStatusEnum(Integer statusId, String statusDesc) {
		this.statusId = statusId;
		this.statusDesc = statusDesc;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public String getStatusDesc() {
		return statusDesc;
	}
}
