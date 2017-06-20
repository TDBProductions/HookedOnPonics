package com.tdb.hop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GROWBEDS")
public class Bed {
	@Id
	@Column(name="BED_ID")
	private long bedId;
	@Column(name="BED_LOCATION")
	private String bedLocation;
	@Column(name="BED_PRODUCING")
	private String bedProducting;
}
