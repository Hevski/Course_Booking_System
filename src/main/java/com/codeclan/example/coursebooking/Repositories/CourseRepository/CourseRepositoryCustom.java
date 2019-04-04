package com.codeclan.example.coursebooking.Repositories.CourseRepository;

import com.codeclan.example.coursebooking.Models.Course;

import java.util.List;

public interface CourseRepositoryCustom  {

    List<Course> findCourseByCustomerId(Long customerId);
}
