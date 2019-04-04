package com.codeclan.example.coursebooking;

import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.Repositories.CustomerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canGetAllCustomersForAGivenCourse(){
		List<Customer> found = customerRepository.findCustomerByCourseId(2L);
		assertEquals(2, found.size());
	}

	@Test
	public void canGetAllCoursesForAGivenCustomer(){
		List<Course> found = courseRepository.findCourseByCustomerId(1L);
		assertEquals(2, found.size());
	}

}
