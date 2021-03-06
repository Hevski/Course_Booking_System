package com.codeclan.example.coursebooking.Components;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.BookingRepositories.BookingRepository;
import com.codeclan.example.coursebooking.Repositories.CourseRepository.CourseRepository;
import com.codeclan.example.coursebooking.Repositories.CustomerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CourseRepository courseRepository;

    public DataLoader(){
    }

    public void run(ApplicationArguments args){
        Customer customer1 = new Customer("Heather", "Kirky", 34);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Eloise", "Glasgow", 32);
        customerRepository.save(customer2);

        Course course1 = new Course("Intro to Python", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course("Data Analysis", "Edinburgh", 6);
        courseRepository.save(course2);

        Booking booking1 = new Booking("12-10-2019", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("07-01-2019", course2, customer1);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("07-01-2019", course2, customer2);
        bookingRepository.save(booking3);
    }

}
