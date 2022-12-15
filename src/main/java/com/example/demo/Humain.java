package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // 1. bydefault singleton class 2. bydefault name of object created will be
			// humain 3. if you have to change the default name Sysntax=
			// @component("name")//
//@Scope(value = "prototype")  // for avoiding singleton
public class Humain {

	private int hid;
	private String hname;
	private String technology;
	@Autowired // simply work with obj name = laptop // simply serach by type not name
	@Qualifier("lap1") // It will serach by name
	private Laptop laptop;

	public Humain() {
		super();
		System.out.println("object created ...");
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public void show() {
		System.out.println("in show");
		laptop.compile();
	}

}
