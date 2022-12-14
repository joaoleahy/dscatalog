package com.devsuperior.dscatalog.resources.repositories;

import com.devsuperior.dscatalog.entities.Product;
import com.devsuperior.dscatalog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}