package kodlamaio.nothwind.business.abstracts;

import kodlamaio.nothwind.entities.concretes.Product;
import java.util.List;

public interface ProductService {
	List<Product> getAll();
}
