package com.codegym.demo_app.repository;



import com.codegym.demo_app.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClassRepository extends JpaRepository<ClassRoom, Integer> {
}
