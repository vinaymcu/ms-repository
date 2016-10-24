package com.app.locationservice.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.locationservice.services.IAddressService;

@RestController
@RequestMapping(value = "/address", produces = {MediaType.APPLICATION_JSON_VALUE})
public class AddressController {

	protected static final Logger log = Logger.getLogger(AddressController.class
            .getName());
   
	@Autowired(required=true)
   protected IAddressService as;
   
   @RequestMapping(value = "/elastic", method = RequestMethod.GET)
   public void byLocationsElasticsearch() {
   	 log.info("*****************Inside the byLocationElasticSearch method*************");
   	 as.byLocationElasticSearch();
       
   }
}
