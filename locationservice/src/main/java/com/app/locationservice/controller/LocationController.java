package com.app.locationservice.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.locationservice.entity.Location;
import com.app.locationservice.services.ILocationService;

@RestController
@RequestMapping(value = "/locations", produces = {MediaType.APPLICATION_JSON_VALUE})
public class LocationController {

    protected static final Logger log = Logger.getLogger(LocationController.class
            .getName());

    @Autowired
    protected ILocationService cs;
    
//    @Autowired
//    private RestTemplate restTemplate; 

   // @Autowired
    // protected CustomerValidator customerValidator;
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) {
//        binder.addValidators(customerValidator);
//    }
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Location> byLocation() {
    	 log.info("*****************Inside the byLocation method*************");
    	 
        return cs.byLocation();
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public Location byName(@PathVariable("name") String name) {
        return cs.findByName(name);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Location byId(@PathVariable("id") String id) {

        return cs.findById(Long.parseLong(id));
    }

    @RequestMapping(value = "/save/", method = RequestMethod.POST)
    public Location saveLocation(@RequestBody Location cust, BindingResult errors) {
        System.out.println("Location save>>>>>>>>>>: ");
       // customerValidator.validate(logger, errors);
        // if (!errors.hasErrors()) {

        return cs.saveLocation(cust);
     //   } else {
        //      System.out.println("Validation failed.......");
        //TODO through exception
        //       return null;
        //   }
        //  return customerRepository.save(cust);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public void deleteLocation(@PathVariable("id") String id) {

        System.out.println("CUSTOMER byId deleteinvoked>>>>>>>>>>: " + id);
        cs.deleteLocation(Long.parseLong(id));
    }
    }
