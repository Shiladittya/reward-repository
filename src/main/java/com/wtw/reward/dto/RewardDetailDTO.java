package com.wtw.reward.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.wtw.reward.custom.EnumValidator;
import com.wtw.reward.custom.FieldMatch;
import com.wtw.reward.enums.InstallmentTypeEnum;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@FieldMatch.List({ @FieldMatch(first = "installmentDetailType", second = "installmentDetailValue", message = "1015") })
public class RewardDetailDTO {

	@NotNull(message = "1009")
	@EnumValidator(message = "1009", enumClass = InstallmentTypeEnum.class)
	private Integer installmentDetailType;

	@NotEmpty(message = "1015")
	private String installmentDetailValue;

}
