package com.codeclan.example.coursebooking.Controllers;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findAllCoursesForAGivenRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{customerId}")
    public List<Course> fondAllCourseForAGivenCustomer(@PathVariable Long customerId){
        return courseRepository.findCourseByCustomerId(customerId);
    }


}
