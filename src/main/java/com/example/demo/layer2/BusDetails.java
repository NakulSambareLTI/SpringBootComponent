package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bus_details")
public class BusDetails {
	
	 @Id
	 @Column(name="BUS_NO")
	 private String bus_no;
	 
	 @Column(name="BUS_TYPE")
	 private String bus_type;
	 
	 
	 @Column(name="NO_OF_SEATS")
	 private int no_of_seates;
	 
	 @Column(name="DRIVER_ID")
	 private int driver_id;
	 
	 @Column(name="TRAVELS_NAME")
	 private String travels_name;
	 
	 @Column(name="COST_PER_SEAT")
	 private int cost_per_seat;

	public String getBus_no() {
		return bus_no;
	}

	public void setBus_no(String bus_no) {
		this.bus_no = bus_no;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public int getNo_of_seates() {
		return no_of_seates;
	}

	public void setNo_of_seates(int no_of_seates) {
		this.no_of_seates = no_of_seates;
	}

	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}

	public String getTravels_name() {
		return travels_name;
	}

	public void setTravels_name(String travels_name) {
		this.travels_name = travels_name;
	}

	public int getCost_per_seat() {
		return cost_per_seat;
	}

	public void setCost_per_seat(int cost_per_seat) {
		this.cost_per_seat = cost_per_seat;
	}
	 
	 
	 

}
