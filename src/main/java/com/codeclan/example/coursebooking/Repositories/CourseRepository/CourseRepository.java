package com.codeclan.example.coursebooking.Repositories.CourseRepository;

import com.codeclan.example.coursebooking.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
