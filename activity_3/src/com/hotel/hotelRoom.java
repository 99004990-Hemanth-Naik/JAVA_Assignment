package com.hotel;

public class hotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public hotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
}
