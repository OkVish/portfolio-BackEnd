package com.portfolio.vish.repository;

import com.portfolio.vish.model.Info;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<Info, Integer> {
    public void deleteById(Long id);
}
