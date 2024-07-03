package com.example.universityoftabriz.Services;

import com.example.universityoftabriz.Objects.CivilDefinedCourses;
import com.example.universityoftabriz.Repository.CivilDefinedCoursesRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CivilDefinedCoursesService implements DefinedCourses<CivilDefinedCourses> {
    @Autowired
    private CivilDefinedCoursesRepository civilDefinedCoursesRepository;

    public void updateCivilDefinedCourses(CivilDefinedCourses civilDefinedCourses, Logger logger) {
        civilDefinedCoursesRepository.save(civilDefinedCourses);
        logger.info("Civil Defined Courses with id: {} updated successfully.",civilDefinedCourses.getId());
    }

    @Override
    public List<CivilDefinedCourses> getDCByTeacherId(Long teacherId){
        return civilDefinedCoursesRepository.findByTeacherId(teacherId);
    }
    @Override
    public List<CivilDefinedCourses> getDCByCourseId(Long courseId){
        return civilDefinedCoursesRepository.findByCourseId(courseId);
    }
    @Override
    public Optional<CivilDefinedCourses> getDCByTeacherIdAndCourseId(Long teacherId, Long courseId){
        return civilDefinedCoursesRepository.findByTeacherIdAndCourseId(teacherId, courseId);
    }
}