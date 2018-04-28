package com.flavaar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.dao.LocationDao;
import com.flavaar.model.Location;

@Service
public class LocationService {

		@Autowired
		private LocationDao locationDao;
		
		public List<Location> getAllLocation() {
			return locationDao.getAllLocation();
		}
		
		public Location saveLocation(Location location) {
			return locationDao.saveLocation(location);
		}
		
}
