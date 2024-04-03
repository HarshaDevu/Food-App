package com.foodapp.major.service;

import com.foodapp.major.repo.CategoryRepo;
import com.foodapp.major.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepo categoryRepo;
    public List<Category> getcategory()
    {
        return categoryRepo.findAll();
    }

    public void addcategory(Category category)
    {
        categoryRepo.save(category);
    }

    public void removeCategoryById(int id)
    {
        categoryRepo.deleteById(id);
    }

    public Optional<Category> getCategoryById(int id){
        return categoryRepo.findById(id);
    }

}
