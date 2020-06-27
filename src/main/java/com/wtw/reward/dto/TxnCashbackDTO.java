package com.wtw.reward.dto;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.wtw.reward.custom.EnumValidator;
import com.wtw.reward.enums.SourceProgramEnum;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class TxnCashbackDTO {
		
	@NotNull(message = "1016")
	@EnumValidator(message = "1016", enumClass = SourceProgramEnum.class)
	private Integer sourceId;

	@NotEmpty(message = "1001")
	@Pattern(regexp = "(^$|[0-9]{10})", message = "1001")
	private String customIdentifier;

	@Valid
	@NotNull(message = "1002")
	private TransactionDetailDTO transactionDetail;

	@Valid
	@Size(min = 1, message = "1007")
	@NotNull(message = "1007")
	private List<RewardDetailDTO> rewardDetail;

}
