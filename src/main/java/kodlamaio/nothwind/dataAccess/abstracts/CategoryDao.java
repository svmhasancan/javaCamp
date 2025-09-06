package kodlamaio.nothwind.dataAccess.abstracts;

import kodlamaio.nothwind.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category, Integer>{

}