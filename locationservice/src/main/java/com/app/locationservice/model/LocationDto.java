package com.app.locationservice.model;

public class LocationDto {

	private Long id;
	private String name;
	private String city;
	private String state;
	private Long pin;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
		this.pin = pin;
	}
	
}
