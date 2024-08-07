package com.example.universityoftabriz.Services;

import com.example.universityoftabriz.Objects.CivilPreCoursesPlan;
import com.example.universityoftabriz.Repository.CivilPreCoursesPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CivilPreCoursesPlanService implements PreCoursesPlan<CivilPreCoursesPlan> {
    @Autowired
    private CivilPreCoursesPlanRepository civilPreCoursesPlanRepository;

    public void updateCivilPreCoursesPlan(CivilPreCoursesPlan civilPreCoursesPlan ) {
        civilPreCoursesPlanRepository.save(civilPreCoursesPlan);
    }

    @Override
    public List<CivilPreCoursesPlan> getPrePlanByCourseId(Long course_id){
        return civilPreCoursesPlanRepository.findByCourseId(course_id);
    }
    @Override
    public List<CivilPreCoursesPlan> getPrePlanByTeacherId(Long teacherId){
        return civilPreCoursesPlanRepository.findByTeacherId(teacherId);
    }
    @Override
    public List<CivilPreCoursesPlan> getPrePlanByCourseIdAndTeacherId(Long courseId, Long teacherId){
        return civilPreCoursesPlanRepository.findByCourseIdAndTeacherId(courseId,teacherId);
    }
    public List<CivilPreCoursesPlan> getPrePlanByTeacherIdAndStatus(Long teacherId, boolean status){
        return civilPreCoursesPlanRepository.findByTeacherIdAndStatus(teacherId, status);
    }

    public List<CivilPreCoursesPlan> getAll(){
        return civilPreCoursesPlanRepository.findAll();
    }

    public Optional<CivilPreCoursesPlan> getCourse(long id){
        return civilPreCoursesPlanRepository.findById(id);
    }
}
