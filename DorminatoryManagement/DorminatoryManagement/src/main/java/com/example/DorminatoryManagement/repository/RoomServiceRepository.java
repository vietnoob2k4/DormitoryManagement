package com.example.DorminatoryManagement.repository;

import com.example.DorminatoryManagement.entity.RoomService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomServiceRepository extends JpaRepository<RoomService, Integer> {
}
