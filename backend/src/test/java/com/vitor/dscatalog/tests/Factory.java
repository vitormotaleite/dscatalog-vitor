package com.vitor.dscatalog.tests;

import java.time.Instant;

import com.vitor.dscatalog.dto.ProductDTO;
import com.vitor.dscatalog.entities.Category;
import com.vitor.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L,"Phone","good phone",800.0,"https://img.com/img.png",Instant.parse("2020-10-20T03:00:00Z"));
		product.getCategories().add(new Category(2L,"eletronicos"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product,product.getCategories());
	}

}
