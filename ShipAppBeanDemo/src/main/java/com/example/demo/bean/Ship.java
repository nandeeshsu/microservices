package com.example.demo.bean;

public class Ship {
private int shipId;
private float shipTon;
private String shipName;

public Ship(int i, float f, String string) {
this.shipId=i;
this.shipName=string;
this.shipTon=f;
}
public int getShipId() {
	return shipId;
}
public void setShipId(int shipId) {
	this.shipId = shipId;
}
public float getShipTon() {
	return shipTon;
}
public void setShipTon(float shipTon) {
	this.shipTon = shipTon;
}
public String getShipName() {
	return shipName;
}
public void setShipName(String shipName) {
	this.shipName = shipName;
}

}
