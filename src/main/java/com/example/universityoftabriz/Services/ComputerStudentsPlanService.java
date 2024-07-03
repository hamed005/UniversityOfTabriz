package com.example.universityoftabriz.Services;

import com.example.universityoftabriz.Objects.ComputerStudentsPlan;
import com.example.universityoftabriz.Objects.ElectricStudentsPlan;
import com.example.universityoftabriz.Repository.ComputerStudentsPlanRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerStudentsPlanService implements StudentsPlanService<ComputerStudentsPlan>{
    @Autowired
    private ComputerStudentsPlanRepository computerStudentsPlanRepository;

    public void updateComputerStudentsPlan(ComputerStudentsPlan computerStudentsPlan, Logger logger) {
        computerStudentsPlanRepository.save(computerStudentsPlan);
        logger.info("Computer Students plan with id: {} updated successfully.",computerStudentsPlan.getId());
    }

    @Override
    public List<ComputerStudentsPlan> getPlanByStudentId(Long student_id) {
        return computerStudentsPlanRepository.findByStudentId(student_id);
    }

    @Override
    public List<ComputerStudentsPlan> getPlanByCourseId(Long course_id) {
        return computerStudentsPlanRepository.findByCourseId(course_id);
    }
}