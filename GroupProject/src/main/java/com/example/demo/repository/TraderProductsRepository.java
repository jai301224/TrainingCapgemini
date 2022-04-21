package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TraderProducts;
@Repository
public interface TraderProductsRepository extends JpaRepository<TraderProducts,Integer> {

}
