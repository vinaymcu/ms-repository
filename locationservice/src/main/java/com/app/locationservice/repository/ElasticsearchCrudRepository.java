package com.app.locationservice.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.app.locationservice.entity.Address;

//public interface ElasticsearchCrudRepository<T, ID extends Serializable> extends ElasticsearchRepository<Address, Long>, PagingAndSortingRepository<Address, Long> {
//	
//	@Query("{"bool" : {"must" : {"field" : {"name" : "?0"}}}}")
//}


public interface ElasticsearchCrudRepository extends ElasticsearchRepository<Address, Long> {
	  //@Query("{"bool" : {"must" : {"field" : {"name" : "?0"}}}}")
	  
	  //Page<Address> findByName(String name,Pageable pageable);
	}