package haha.com.service;

import java.util.List;

import haha.com.domain.Product;

public interface ProductService {
	
	public List<Product> getAllProducts();
	public List<Product> getProductsByCategory();
	public Product getOneProduct();

}
