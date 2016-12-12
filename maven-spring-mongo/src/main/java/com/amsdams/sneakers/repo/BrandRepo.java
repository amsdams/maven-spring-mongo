package com.amsdams.sneakers.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.amsdams.sneakers.entity.Brand;
import com.amsdams.sneakers.entity.Size;

public interface BrandRepo extends MongoRepository<Brand, String> {
	Page<Brand> findByName(@Param("name") String name, Pageable pageable);

}