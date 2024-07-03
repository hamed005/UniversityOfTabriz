package com.example.universityoftabriz.Repository;

import com.example.universityoftabriz.Objects.ElectricStudentsPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ElectricStudentsPlanRepository extends JpaRepository<ElectricStudentsPlan, Long> {

    List<ElectricStudentsPlan> findByStudentId(Long studentId);

    List<ElectricStudentsPlan> findByCourseId(Long courseId);
}