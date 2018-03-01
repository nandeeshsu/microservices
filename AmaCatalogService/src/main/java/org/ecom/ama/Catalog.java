package org.ecom.ama;

public class Catalog{
	private int catalogId;
	private String catalogName;
	private boolean catalogStatus;
	private float catalogPrice;
	public Catalog(int catalogId,String catalogName,boolean catalogStatus,float catalogPrice) {
		this.catalogId=catalogId;
		this.catalogName=catalogName;
		this.catalogStatus=catalogStatus;
		this.catalogPrice=catalogPrice;
	}
	//setters-getters
	public int getCatalogId() {
		return catalogId;
	}
	public void setCatlogueId(int catalogId) {
		this.catalogId = catalogId;
	}
	public String getCatalogName() {
		return catalogName;
	}
	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}
	public boolean isCatalogStatus() {
		return catalogStatus;
	}
	public void setCatalogStatus(boolean catalogStatus) {
		this.catalogStatus = catalogStatus;
	}
	public float getCatalogPrice() {
		return catalogPrice;
	}
	public void setCatalogPrice(float catalogPrice) {
		this.catalogPrice = catalogPrice;
	}

}
