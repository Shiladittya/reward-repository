package com.wtw.reward.enums;

public enum SourceProgramEnum {
	DATA_MANAGER(1);

	private Integer sourceProgramId;

	private SourceProgramEnum(Integer sourceProgramId) {
		this.sourceProgramId = sourceProgramId;
	}

	public Integer getSourceProgramId() {
		return sourceProgramId;
	}

}
