package com.example.DorminatoryManagement.repository;

import com.example.DorminatoryManagement.entity.UtilityService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilityServiceRepository extends JpaRepository<UtilityService, Integer> {
}
