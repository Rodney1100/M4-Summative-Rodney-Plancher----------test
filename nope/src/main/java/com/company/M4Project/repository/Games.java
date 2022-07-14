package com.company.M4Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Games extends JpaRepository<Games,Integer> {

}
