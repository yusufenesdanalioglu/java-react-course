package oopIntro;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Lenova V14",15000,"16 Gb Ram", 10, 13500);
		Product product1 = new Product(2,"Lenova V15",15000,"34 Gb Ram", 10, 13500);
		Product product2 = new Product(3,"Lenova V16",15000,"64 Gb Ram", 10, 13500);
		Category category = new Category(1,"Teknoloji");
		Category category1 = new Category(1,"Ev Ya�am");
		Category category2 = new Category(1,"Mutfak");
		
		ArrayList<Product> products = new ArrayList<Product>();
		ProductManager prdMngr = new ProductManager();
		
		//�r�n listesini olu�tur
		prdMngr.createProductList(products,product);
		prdMngr.createProductList(products,product1);
		prdMngr.createProductList(products,product2);

		//�r�n listesini yazd�r
		prdMngr.writeProductName(products);
		
		
		ArrayList<Category> categories = new ArrayList<Category>();
		CategoryManager ctgMngr = new CategoryManager();
		
		//kategori listesini olu�tur
		ctgMngr.createCategoryList(categories, category);
		ctgMngr.createCategoryList(categories,category1);
		ctgMngr.createCategoryList(categories,category2);

		//�r�n listesini yazd�r
		ctgMngr.writeCategoryName(categories);
	}
}
