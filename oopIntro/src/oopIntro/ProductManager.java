package oopIntro;

import java.util.ArrayList;

public class ProductManager {

	public ArrayList<Product> createProductList(ArrayList<Product> products,Product product){
		products.add(product);
		return products;
	}
	
	public void writeProductName(ArrayList<Product> products){
		System.out.println("***********************Ürün Listesi***********************");
		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getId()+". numarali ürün ");
			System.out.println("ad: "+ products.get(i).getName());
			System.out.println("fiyat: "+ products.get(i).getUnitPrice());
			System.out.println("detay: "+ products.get(i).getDetail());
		} 
	}
}
