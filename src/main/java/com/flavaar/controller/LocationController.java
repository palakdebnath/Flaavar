package com.flavaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flavaar.model.Location;
import com.flavaar.service.LocationService;

@RestController
@RequestMapping(value="/location")
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value="/all",  method=RequestMethod.GET)
	public List<Location> getAllLocations() {
		return locationService.getAllLocation();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Location saveLocation(@RequestBody Location location) {
		return locationService.saveLocation(location);
	}
}
