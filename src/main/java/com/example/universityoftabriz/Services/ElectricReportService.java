package com.example.universityoftabriz.Services;

import com.example.universityoftabriz.Objects.ElectricReport;
import com.example.universityoftabriz.Objects.MechanicReport;
import com.example.universityoftabriz.Repository.ElectricReportRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ElectricReportService implements ReportService<ElectricReport>{
    @Autowired
    private ElectricReportRepository electricReportRepository;

    public void updateElectricReport(ElectricReport electricReport, Logger logger) {
        electricReportRepository.save(electricReport);
        logger.info("Electric Report with id: {} updated successfully.",electricReport.getId());
    }

    @Override
    public List<ElectricReport> getReportsByTeacherId(Long teacher_id) {
        return electricReportRepository.findByTeacherId(teacher_id);
    }

    @Override
    public List<ElectricReport> getReportsByCourseId(Long course_id) {
        return electricReportRepository.findByCourseId(course_id);
    }

    @Override
    public List<ElectricReport> getReportsByTeacherIdAndCourseId(Long teacher_id, Long course_id) {
        return electricReportRepository.findByTeacherIdAndCourseId(teacher_id, course_id);
    }

    @Override
    public Optional<ElectricReport> getReportSpecific(Date date, Long teacher_id, Long course_id) {
        return electricReportRepository.findByDateOfSubmitionAndTeacherIdAndCourseId(date, teacher_id, course_id);
    }
}