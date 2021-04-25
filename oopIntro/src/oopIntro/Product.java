package oopIntro;

import java.lang.reflect.Constructor;

public class Product {
	public Product(){
		System.out.println("Boþ constructor çalýþtý");
	}
	
	public Product(int id, String name, double unitPrice, String detail){
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
