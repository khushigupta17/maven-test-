package in.ac.sharda.pizzaapplication.domain;

public class product {
	private int price, id;
	private String name, description;
	
	public product(int price, int id, String name, String description) {
		super();
		this.price = price;
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof product)
		{
			return ((product)obj).getId()==id;
		}
		return false;
	}
	

}
