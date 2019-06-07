package in.ac.sharda.pizzaapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.pizzaapplication.domain.product;

@RestController
public class ProductListController {

	@GetMapping("/product/list")
	public List<product> products(){
		List<product> products = new ArrayList<>();
		for(int i = 1; i < 20; i++){
			products.add(
					new product(i, i*10,"Name "+i,
							"Desc "+i,i*i*i*i));
		}
		return products;
	}
}
