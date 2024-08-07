package com.example.universityoftabriz.Repository;

import com.example.universityoftabriz.Objects.ChemistryStudentsPlan;
import com.example.universityoftabriz.Objects.ElectricReport;
import com.example.universityoftabriz.Objects.MechanicReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ElectricReportRepository extends JpaRepository<ElectricReport, Long> {

    List<ElectricReport> findByTeacherId(Long teacher_id);

    List<ElectricReport> findByCourseId(Long course_id);

    List<ElectricReport> findByTeacherIdAndCourseId(Long teacher_id, Long course_id);

    Optional<ElectricReport> findByDateOfSubmitionAndTeacherIdAndCourseId(Date date_of_submition, Long teacher_id, Long course_id);
    @Query(value = "SELECT * FROM resources ORDER BY id DESC LIMIT 1", nativeQuery = true)
    ElectricReport findLastRecord();
}
