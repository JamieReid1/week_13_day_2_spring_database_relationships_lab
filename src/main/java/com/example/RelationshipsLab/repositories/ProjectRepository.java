package com.example.RelationshipsLab.repositories;

import com.example.RelationshipsLab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
