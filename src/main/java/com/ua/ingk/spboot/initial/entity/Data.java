package com.ua.ingk.spboot.initial.entity;

public class Data implements DomainObject {

	private static final long serialVersionUID = 7892574091243969742L;

	private int id;

	private String description;

	public Data(int id, String description) {
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
