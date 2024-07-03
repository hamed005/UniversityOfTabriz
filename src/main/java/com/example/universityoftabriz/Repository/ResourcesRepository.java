package com.example.universityoftabriz.Repository;

import com.example.universityoftabriz.Objects.Resources;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface ResourcesRepository extends JpaRepository<Resources, Long> {


    Optional<Resources> findByYearEdAndSemester(Date year_ed, int semester);
}
