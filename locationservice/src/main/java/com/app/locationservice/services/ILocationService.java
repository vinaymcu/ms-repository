
package com.app.locationservice.services;

import com.app.locationservice.entity.Location;
import java.util.List;

public interface ILocationService {
    
  public List<Location> byLocation();
  public Location findByName(String name);
  public Location findById(Long id);
  public Location saveLocation(Location ce);
  public void deleteLocation(Long id);
  
}
