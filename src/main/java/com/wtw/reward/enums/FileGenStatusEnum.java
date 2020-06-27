package com.wtw.reward.enums;

public enum FileGenStatusEnum {

	PENDING(0), SUCCESS(1);

	private Integer statusId;

	private FileGenStatusEnum(Integer statusId) {
		this.statusId = statusId;
	}

	public Integer getStatusId() {
		return statusId;
	}

}
