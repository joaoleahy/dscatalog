package com.devsuperior.dscatalog.resources.repositories;

import com.devsuperior.dscatalog.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dscatalog.entities.Product;

public interface RoleRepository extends JpaRepository<Role, Long> {


}