package com.test1;

public class Warehouse {
	public int id;
	private String location;
	private String name;
	private String contents;
	private int capacity;
	private String status;

	public Warehouse() {

	}

	public Warehouse(int id, String location, String name, String contents, int capacity, String status) {
		super();
		this.id = id;
		this.location = location;
		this.name = name;
		this.contents = contents;
		this.capacity = capacity;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
