package com.vitor.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
