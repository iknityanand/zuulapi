package com.brownie.zuulapi.domain;

public class Foo {
	
	private long id;
	private String name;

	public Foo() {
		// TODO Auto-generated constructor stub
	}

	public Foo(long parseLong, String randomAlphabetic) {
		// TODO Auto-generated constructor stub
		this.name=randomAlphabetic;
		this.id=parseLong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
