package com.vitor.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitor.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
