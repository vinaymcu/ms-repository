package com.app.locationservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.app.locationservice.entity.Location;
import com.app.locationservice.repository.LocationRepository;
import com.app.locationservice.repository.LocationRepository1;

@Service
public class LocationService implements ILocationService {

    @Autowired	
    LocationRepository locationRepository;
    
  //  @Autowired
  //  LocationRepository1<Location, Long> locationRepository1	;
    

    @Override
    public List<Location> byLocation() {
    //	Page p=locationRepository1.findAll(new PageRequest(1, 3));
       // System.out.println("Page Size:::"+p.getSize());
        //List<Location> l=p.getContent();
        //System.out.println("l:::"+l);
        return locationRepository.findAll();
    }

    @Override
    public Location findByName(String name) {
        return locationRepository.findByName(name);
    }

    @Override
    public Location findById(Long id) {
        return locationRepository.findById(id);
    }

    @Override
    public Location saveLocation(Location ce) {
         return locationRepository.save(ce);
    }

    @Override
    public void deleteLocation(Long id) {
        locationRepository.delete(id);
    }


    
}
