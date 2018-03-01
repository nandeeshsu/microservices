package com.example.demo.bean;

public class Ship {
private int shipId;
private float shipCharges;
private String shipName;

public Ship(int i, float f, String string) {
this.shipId=i;
this.shipName=string;
this.shipCharges=f;
}
public int getShipId() {
	return shipId;
}
public void setShipId(int shipId) {
	this.shipId = shipId;
}
public float getShipCharges() {
	return shipCharges;
}
public void setShipCharges(float shipCharges) {
	this.shipCharges = shipCharges;
}
public String getShipName() {
	return shipName;
}
public void setShipName(String shipName) {
	this.shipName = shipName;
}

}
