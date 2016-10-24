package com.app.locationservice.repository;

import java.io.Serializable;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import com.app.locationservice.entity.Location;

public interface LocationRepository1<T, ID extends Serializable> extends CrudRepository<Location, Long> {

	Iterable<T> findAll(Sort sort);

	Page<T> findAll(Pageable pageable);
}

