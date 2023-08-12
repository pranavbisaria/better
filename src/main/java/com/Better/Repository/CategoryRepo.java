package com.Better.Repository;
import com.Better.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
