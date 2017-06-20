package com.tdb.hop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OXYGEN_SENSOR")
public class OxygenSensor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="LOG_ID")
	private long logId;
	@Column(name="SENSOR_ID")
	private long sensorId;
	@Column(name="BED_ID")
	private long bedId;
	@Column(name="SENSOR_READING")
	private String sensorReading;
	@Column(name="TIMESTAMP")
	private String timestamp;
	
	public long getLogId() {
		return logId;
	}
	public void setLogId(long logId) {
		this.logId = logId;
	}
	public long getSensorId() {
		return sensorId;
	}
	public void setSensorId(long sensorId) {
		this.sensorId = sensorId;
	}
	public long getBedId() {
		return bedId;
	}
	public void setBedId(long bedId) {
		this.bedId = bedId;
	}
	public String getSensorReading() {
		return sensorReading;
	}
	public void setSensorReading(String sensorReading) {
		this.sensorReading = sensorReading;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
}
