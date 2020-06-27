package com.wtw.reward.custom;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.wtw.reward.enums.DeliveryMethodEnum;
import com.wtw.reward.enums.EventEnum;
import com.wtw.reward.enums.InstallmentTypeEnum;
import com.wtw.reward.enums.SourceProgramEnum;

public class EnumValidatorImpl implements ConstraintValidator<EnumValidator, Integer> {

	List<Integer> valueList = null;

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return valueList.contains(value);
	}

	@Override
	public void initialize(EnumValidator constraintAnnotation) {
		valueList = new ArrayList<>();
		Class<? extends Enum<?>> enumClass = constraintAnnotation.enumClass();

		Enum<?>[] enumValArr = enumClass.getEnumConstants();

		for (Enum<?> enumVal : enumValArr) {
			if (enumVal instanceof DeliveryMethodEnum) {
				valueList.add(((DeliveryMethodEnum) enumVal).getDeliveryMethod());
			} else if (enumVal instanceof InstallmentTypeEnum) {
				valueList.add(((InstallmentTypeEnum) enumVal).getType());
			} else if (enumVal instanceof SourceProgramEnum) {
				valueList.add(((SourceProgramEnum) enumVal).getSourceProgramId());
			} else if (enumVal instanceof EventEnum) {
				valueList.add(((EventEnum) enumVal).getEventId());
			} 
		}
	}
}
