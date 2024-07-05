package com.example.universityoftabriz.Repository;

import com.example.universityoftabriz.Objects.ChemistryPreCoursesPlan;
import com.example.universityoftabriz.Objects.MechanicPreCoursesPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MechanicPreCoursesPlanRepository extends JpaRepository<MechanicPreCoursesPlan, Long> {


    List<MechanicPreCoursesPlan> findByCourseId(Long course_id);

    List<MechanicPreCoursesPlan> findByTeacherId(Long teacherId);

    List<MechanicPreCoursesPlan> findByCourseIdAndTeacherId(Long courseId, Long teacherId);
    List<MechanicPreCoursesPlan> findByTeacherIdAndStatus(Long teacherId, boolean status);
}
