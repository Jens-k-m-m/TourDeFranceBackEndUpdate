package com.example.backendupdate.repository;

import com.example.backendupdate.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
