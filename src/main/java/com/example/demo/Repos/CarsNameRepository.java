package com.example.demo.Repos;

import com.example.demo.CarsName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsNameRepository extends JpaRepository<CarsName, Long> {
}
