package com.tdb.hop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SETTINGS")
public class Setting {
	@Id
	@Column(name="SETTING_NAME")
	private String settingName;
	@Column(name="SETTING_VALUE")
	private String settingValue;
	
}
