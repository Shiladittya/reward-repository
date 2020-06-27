package com.wtw.reward.enums;

public enum ErrorCodeEnum {
		
	SUCCESS("200","Success"),
	FAILED("1014","Failed"),
	
	INVALID_CUSTOME_IDENTIFIER("1001","Please provide valid custom identifier"),
	
	INVALID_TRANSACTION_DETAILS("1002","Please provide transaction details"),
	INVALID_TRANSACTION_ID("1003","Please provide valid transaction id"),
	INVALID_TRANSACTION_PROGRAM_ID("1004","Please provide valid program id"),
	INVALID_TRANSACTION_DATE("1005","Please provide valid transaction date"),
	INVALID_CASHMEMO_DATE("1006","Please provide valid cashmemo date"),
	
	INVALID_REWARD_DETAILS("1007","Please provide reward details"),
	INVALID_REWARD_DELIVERY_METHOD("1008","Please provide valid delevery method"),
	INVALID_REWARD_INSTALLMENT_DETAIL_TYPE("1009","Please provide valid installment detail type"),
	INVALID_REWARD_DELIVERY_PROGRAM_ID("1010","Please provide reawrd delivery program id"),
	INVALID_REWARD_DELIVERY_WALLET_ID("1011","Please provide reward delivery wallet id"),
	INVALID_REWARD_ISSUANCE_DATE("1012","Please provide valid issuance date"),
	INVALID_REWARD_EXPIRY_DATE("1013","Please provide valid reward expiry date"),
	DUPLICATE_TXN_FOUND("1014","Duplicate transaction found"),
	INVALID_REWARD_INSTALLMENT_VALUE("1015","Please provide valid installment detail value"),
	
	INVALID_SOURCE_ID("1016","Please provide valid source id"),
	INVALID_EVENT_ID("1017","Please provide valid event id"),
	INVALID_STORE_CODE("1018","Please provide valid store code"),
	INVALID_CHANNEL_ID("1019","Please provide valid channel id");

	private final String errorCode;
	private final String errorMsg;

	private ErrorCodeEnum(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public static ErrorCodeEnum getEnumErrorCode(String errorCode) {
		ErrorCodeEnum[] allValues = ErrorCodeEnum.values();

		for (ErrorCodeEnum value : allValues) {
			if (value.getErrorCode().equals(errorCode)) {
				return value;
			}
		}

		return null;
	}
}
