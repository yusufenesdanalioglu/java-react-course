package oopIntro;

import java.util.ArrayList;

public class CategoryManager {

	public ArrayList<Category> createCategoryList(ArrayList<Category> categories,Category category){
		categories.add(category);
		return categories;
	}
	
	public void writeCategoryName(ArrayList<Category> categories){
		System.out.println("***********************Kategori Listesi***********************");
		for (int i = 0; i < categories.size(); i++) {
			System.out.println(categories.get(i).id+". numarali ürün ");
			System.out.println("ad: "+ categories.get(i).name);
		}
	}
}
