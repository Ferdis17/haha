package haha.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import haha.com.domain.Product;
import haha.com.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {
		
		return (List<Product>) productRepository.findAll();
	}

	@Override
	public List<Product> getProductsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getOneProduct() {
		// TODO Auto-generated method stub
		return null;
	}

		
}
