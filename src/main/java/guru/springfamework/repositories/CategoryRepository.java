package guru.springfamework.repositories;

import guru.springfamework.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 Create by Joharry Correa 09/08/2018
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
