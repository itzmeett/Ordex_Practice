package com.student.managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.managment.entity.CloneStudent;

@Repository
public interface CloneStudentRepository extends JpaRepository<CloneStudent, Long>{

}
