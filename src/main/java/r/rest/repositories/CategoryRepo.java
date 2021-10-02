package r.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import r.rest.models.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
