
package com.app.locationservice.repository;

import com.app.locationservice.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LocationRepository extends JpaRepository<Location, Long> {

    public Location findByName(String name);

    public Location findById(Long id);

}
