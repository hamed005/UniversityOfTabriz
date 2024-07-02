package com.example.universityoftabriz.Services;

import com.example.universityoftabriz.Objects.ChemistryHistoryOfPassedCourses;
import com.example.universityoftabriz.Repository.ChemistryHistoryOfPassedCoursesRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChemistryHistoryOfPassedCoursesService implements HistoryOfPassedCourses<ChemistryHistoryOfPassedCourses>{
    @Autowired
    private ChemistryHistoryOfPassedCoursesRepository chemistryHistoryOfPassedCoursesRepository;

    public void updateChemistryHistoryOfPassedCourses(ChemistryHistoryOfPassedCourses chemistryHistoryOfPassedCourses, Logger logger) {
        chemistryHistoryOfPassedCoursesRepository.save(chemistryHistoryOfPassedCourses);
        logger.info("Chemistry History of passed courses with id: {} updated successfully.",chemistryHistoryOfPassedCourses.getId());
    }

    @Override
    public List<ChemistryHistoryOfPassedCourses> getHistoryOfPCByStudentId(Long studentId){
        return chemistryHistoryOfPassedCoursesRepository.findByStudentId(studentId);
    }
    @Override
    public List<ChemistryHistoryOfPassedCourses> findByStudentIdAndCourseId(Long studentId, Long courseId){
        return chemistryHistoryOfPassedCoursesRepository.findByStudentIdAndCourseId(studentId,courseId);
    }
}
