package com.flavaar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.model.Location;
import com.flavaar.repository.LocationRepository;

@Service
public class LocationDao {

	@Autowired
	private LocationRepository locationRepository;

	public List<Location> getAllLocation() {
		return locationRepository.findAll();
	}
	
	public Location saveLocation(Location location) {
		Location savedLocation = locationRepository.save(location);
		return savedLocation;
	}
	
}
