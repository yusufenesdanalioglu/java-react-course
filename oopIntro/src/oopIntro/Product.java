package oopIntro;

import java.lang.reflect.Constructor;

public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPiceAfterDiscount;
	
	public Product(){
		System.out.println("Boþ constructor çalýþtý");
	}
	
	public Product(int id, String name, double unitPrice, String detail,double discount, double unitPiceAfterDiscount) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;
		this.unitPiceAfterDiscount = unitPiceAfterDiscount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitPiceAfterDiscount() {
		return unitPiceAfterDiscount;
	}

	public void setUnitPiceAfterDiscount(double unitPiceAfterDiscount) {
		this.unitPiceAfterDiscount = unitPiceAfterDiscount;
	}
	
}
