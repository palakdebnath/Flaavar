package com.flavaar.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="location")
public class Location {
	
	@Id
	@OneToMany(targetEntity=Order.class )
	private String locatioId;
	
	private String locationName;

	public String getLocatioId() {
		return locatioId;
	}

	public void setLocatioId(String locatioId) {
		this.locatioId = locatioId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
