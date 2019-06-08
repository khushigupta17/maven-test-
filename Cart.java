package in.ac.sharda.pizzaapplication.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private int id=0;


	public Cart(int i, int j, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	private List<product> products
			= new ArrayList<>();
	
	public void addProduct(product product){
		this.products.add(product);
	}

	private List<product> setUniqueItem()
	{
		List<product> uniqList=new ArrayList<>();
		for(product p : products)
		{
			if(!uniqList.contains(p))
			{
				uniqList.add(p);
			}
		}
		return uniqList;
	}

	private void removeItem(product prdct)
	{
		products.remove(prdct);
	}

}














