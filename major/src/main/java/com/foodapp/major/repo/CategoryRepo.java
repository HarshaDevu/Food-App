package com.foodapp.major.repo;

import com.foodapp.major.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,Integer>
{

}
