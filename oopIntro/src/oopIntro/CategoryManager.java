package oopIntro;

import java.util.ArrayList;

public class CategoryManager {

	public ArrayList<Category> createProductList(Category category){
		ArrayList<Category> categoryies = new ArrayList<Category>();
		categoryies.add(category);
		return categoryies;
	}
	
	public void writeCategoryName(Category category){
		System.out.println(category.name);
	}
}
