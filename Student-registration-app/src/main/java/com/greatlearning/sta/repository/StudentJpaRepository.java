package com.greatlearning.sta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.sta.model.Student;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Long>  {

}
