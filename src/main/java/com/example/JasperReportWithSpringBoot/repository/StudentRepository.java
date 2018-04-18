package com.example.JasperReportWithSpringBoot.repository;

import com.example.JasperReportWithSpringBoot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
