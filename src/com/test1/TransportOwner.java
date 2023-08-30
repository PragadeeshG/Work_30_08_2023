package com.test1;

public class TransportOwner {
	private int id;
	private int transportationId;
	private String name;
	private String userValidationStatus;
	private String permitType;
	private int experience;
	private String status;

	public TransportOwner() {

	}

	public TransportOwner(int id, int transportationId, String name, String userValidationStatus, String permitType,
			int experience, String status) {
		super();
		this.id = id;
		this.transportationId = transportationId;
		this.name = name;
		this.userValidationStatus = userValidationStatus;
		this.permitType = permitType;
		this.experience = experience;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTransportationId() {
		return transportationId;
	}

	public void setTransportationId(int transportationId) {
		this.transportationId = transportationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserValidationStatus() {
		return userValidationStatus;
	}

	public void setUserValidationStatus(String userValidationStatus) {
		this.userValidationStatus = userValidationStatus;
	}

	public String getPermitType() {
		return permitType;
	}

	public void setPermitType(String permitType) {
		this.permitType = permitType;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
