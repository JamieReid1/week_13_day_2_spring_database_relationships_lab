package com.example.RelationshipsLab.repositories;

import com.example.RelationshipsLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
