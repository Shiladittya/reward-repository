package com.wtw.reward.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;

import com.wtw.reward.enums.ErrorCodeEnum;
import com.wtw.reward.enums.InstallmentTypeEnum;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
	private String firstFieldName;
	private String secondFieldName;

	@Override
	public void initialize(final FieldMatch constraintAnnotation) {
		firstFieldName = constraintAnnotation.first();
		secondFieldName = constraintAnnotation.second();
	}

	@Override
	public boolean isValid(final Object value, final ConstraintValidatorContext context) {
		boolean isValidData = true;

		try {
			final Integer firstObj = Integer.valueOf(BeanUtils.getProperty(value, firstFieldName));
			final String secondObj = BeanUtils.getProperty(value, secondFieldName);

			String message = "";

			if (!InstallmentTypeEnum.isCashbackReward(firstObj)) {
				if (!isDouble(secondObj)) {
					message = ErrorCodeEnum.INVALID_REWARD_INSTALLMENT_VALUE.getErrorCode();
					isValidData = false;
				}
			}

			// disable existing violation message
			context.disableDefaultConstraintViolation();

			// build new violation message and add it
			context.buildConstraintViolationWithTemplate(message).addConstraintViolation();
		} catch (final Exception e) {
			isValidData = false;
		}

		return isValidData;
	}

	boolean isDouble(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}