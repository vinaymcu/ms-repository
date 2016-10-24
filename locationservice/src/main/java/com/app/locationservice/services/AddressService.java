package com.app.locationservice.services;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.app.locationservice.entity.Address;
import com.app.locationservice.repository.ElasticsearchCrudRepository;

@Service
public class AddressService implements IAddressService {

	@Autowired
	ElasticsearchCrudRepository elasticRepository;
	
	@Autowired
    private ElasticsearchTemplate elasticsearchTemplate;	

	@Override
	public void byLocationElasticSearch() {

		Address c1 = new Address();
		//c1.setId(1L);
		c1.setName("V1c");
		c1.setCity("DEL1");
		c1.setState("DELL1");
		c1.setPin(10L);

		Address c2 = new Address();
		//c2.setId(2L);
		c2.setName("V2v");
		c2.setCity("DEL2");
		c2.setState("DELL2");
		c2.setPin(20L);
		
		Address c4 = new Address();
		c4.setName("V3vvv");
		c4.setCity("DEL3vv");
		c4.setState("DELL3vv");
		c4.setPin(300L);

		 List<IndexQuery> indexQueries = new ArrayList<IndexQuery>();
	     elasticRepository.save(asList(c1,c2,c4));
		 
		 IndexQuery indexQuery1 = new IndexQueryBuilder().withId(String.valueOf(c1.getId())).withObject(c1).build();
//		 indexQueries.add(indexQuery1);
//			
//		IndexQuery indexQuery2 = new IndexQueryBuilder().withId(String.valueOf(c2.getId())).withObject(c2).build();
//		indexQueries.add(indexQuery2);
//		elasticsearchTemplate.bulkIndex(indexQueries);

		
	     //SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(indexQuery1);
	     
	    //Page<Address> sampleEntities = elasticsearchTemplate.queryForPage(searchQuery,Address.class);
			    
	    System.out.println("AFTER SAVE thy Location list");
		System.out.println("elasticRepository.count() list:"+elasticRepository.count());
		System.out.println("elasticRepository.exists(1L) list:"+elasticRepository.exists(1L));
		System.out.println("elasticRepository.exists(5L) list:"+elasticRepository.exists(5L));
		
        
		//indexQueries.add(indexQuery1);
		
		Iterable<Address> l = elasticRepository.findAll();
		System.out.println("AFTER Location list>>>" + l.spliterator().estimateSize());

//		Iterator<Address> itr = l.iterator();
//
//		while (itr.hasNext()) {
//			Address loc =  itr.next();
//			System.out.println(loc.getId()+":DATA:::" + loc.getName() + "_________" + loc.getCity());
//		}
	}
}
