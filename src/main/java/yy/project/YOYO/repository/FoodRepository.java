package yy.project.YOYO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import yy.project.YOYO.domain.Food;
import yy.project.YOYO.vo.FoodVO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface FoodRepository extends JpaRepository<Food, Long> {

    @Query(value="select count(*) from food f where f.food_name=:foodName", nativeQuery = true)
    int checkFood(@Param("foodName") String foodName);

    List<Food> findByFoodCategory(@Param("foodType") String foodType);

    List<Food> findAll();

    List<Food> findByFoodCategoryNotIn(List<String> food_type);

    Food findByFoodName(@Param("foodName") String foodName);


}
