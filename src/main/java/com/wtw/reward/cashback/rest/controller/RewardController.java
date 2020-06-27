package com.wtw.reward.cashback.rest.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wtw.reward.dto.BaseResponseDTO;
import com.wtw.reward.dto.TxnCashbackDTO;
import com.wtw.reward.enums.ErrorCodeEnum;

@RestController
@RequestMapping("/api")
public class RewardController {

	public static final Logger LOGGER = LoggerFactory.getLogger(RewardController.class);

	@PostMapping(value = "/parsingReward")
	public BaseResponseDTO parsingReward(@Valid @RequestBody TxnCashbackDTO txnCashbackDTO, BindingResult bindingResult) {

		LOGGER.info("Parsing reward request {}", txnCashbackDTO);

		BaseResponseDTO baseResponseDTO = new BaseResponseDTO();

		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();

			ErrorCodeEnum errorCodeEnum = ErrorCodeEnum.getEnumErrorCode(fieldError.getDefaultMessage());

			baseResponseDTO.setResponseCode(errorCodeEnum.getErrorCode());
			baseResponseDTO.setResponseMessage(errorCodeEnum.getErrorMsg());
		} else {

			try {

				// Business logic
				baseResponseDTO.setResponseCode(ErrorCodeEnum.SUCCESS.getErrorCode());
				baseResponseDTO.setResponseMessage(ErrorCodeEnum.SUCCESS.getErrorMsg());
			} catch (Exception e) {
				LOGGER.info("Exception occured while parsing reward request {} and exception {}", txnCashbackDTO, e);
				baseResponseDTO.setResponseCode(ErrorCodeEnum.FAILED.getErrorCode());
				baseResponseDTO.setResponseMessage(ErrorCodeEnum.FAILED.getErrorMsg());
			}
		}

		LOGGER.info("Parsing reward response {} for request {}", baseResponseDTO, txnCashbackDTO);

		return baseResponseDTO;
	}

}
