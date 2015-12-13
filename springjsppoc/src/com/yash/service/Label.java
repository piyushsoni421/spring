package com.yash.service;

import org.springframework.stereotype.Component;

@Component
public class Label {
  
	
	int labelId;
	String labelName;
	
	boolean euRegion;
	boolean region;

	public boolean isRegion() {
		return region;
	}

	public void setRegion(boolean region) {
		this.region = region;
	}

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public boolean isEuRegion() {
		return euRegion;
	}

	public void setEuRegion(boolean euRegion) {
		this.euRegion = euRegion;
	}
}
