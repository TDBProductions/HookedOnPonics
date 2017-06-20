package com.tdb.hop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EVENT")
public class Event {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EVENT_ID")
	private long eventId;
	@Column(name="EVENT_NAME")
	private String eventName;
	@Column(name="EVENT_DESCRIPTION")
	private String eventDescription;
	@Column(name="EVENT_LEVEL")
	private String eventLevel;
	@Column(name="EVENT_AFFECTED_BEDS")
	private String eventAffectedBeds;
	
	// Getters and Setters
	public long getEventId() {
		return eventId;
	}
	public void setEventId(long eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getEventLevel() {
		return eventLevel;
	}
	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}
	public String getEventAffectedBeds() {
		return eventAffectedBeds;
	}
	public void setEventAffectedBeds(String eventAffectedBeds) {
		this.eventAffectedBeds = eventAffectedBeds;
	}

}	
