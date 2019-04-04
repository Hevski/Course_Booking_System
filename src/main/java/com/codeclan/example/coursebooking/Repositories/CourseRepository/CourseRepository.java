package com.codeclan.example.coursebooking.Repositories.CourseRepository;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Projections.EmbedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedCourse.class)
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    //    Get all courses with a given rating
    List<Course> findCoursesByRating(int rating);

}
