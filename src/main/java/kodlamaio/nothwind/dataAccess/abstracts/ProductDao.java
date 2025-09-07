package kodlamaio.nothwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.nothwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	Product getByProductName(String productName);
	Product getByProductNameAndCategoryId(String productName,int categoryId);
	List<Product> getByProductNameOrCategoryId(String productName ,int categoryId);
	List<Product> getByCategoryIdIn(List<Integer> categories);
	List<Product> geyByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);
	
	@Query("From Product where productName =: productName and categoryId =: categoryId")
	List<Product> getByProductAndCategory(String productName , int categoryId);
}