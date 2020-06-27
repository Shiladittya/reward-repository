package com.wtw.reward.enums;

public enum TxnCashbackFieldEnum {

	ID("id", "_id"), 
	SOURCE_ID("sourceId", "");
	

	String specialKey;
	String dbKey;

	TxnCashbackFieldEnum(String specialKey, String dbKey) {
		this.specialKey = specialKey;
		this.dbKey = dbKey;
	}

	public String getSpecialKey() {
		return specialKey;
	}


	public String getDbKey() {
		return dbKey;
	}
}
