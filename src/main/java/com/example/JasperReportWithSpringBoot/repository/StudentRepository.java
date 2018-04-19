package com.example.JasperReportWithSpringBoot.repository;

import com.example.JasperReportWithSpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> findAllByDate(Date date);
}
