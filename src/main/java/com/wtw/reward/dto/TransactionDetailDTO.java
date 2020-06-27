package com.wtw.reward.dto;

import javax.validation.constraints.NotEmpty;

import com.wtw.reward.custom.CheckDateFormat;
import com.wtw.reward.custom.DateUtils;
import com.wtw.reward.custom.EnumValidator;
import com.wtw.reward.enums.EventEnum;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TransactionDetailDTO {

	@NotEmpty(message = "1003")
	private String txnId;

	@EnumValidator(message = "1017", enumClass = EventEnum.class)
	private Integer eventId;

	@NotEmpty(message = "1005")
	@CheckDateFormat(message = "1005", pattern = DateUtils.YYYYMMDDDASH)
	private String transactionDate;

}
