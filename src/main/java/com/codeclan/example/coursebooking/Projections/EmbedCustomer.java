package com.codeclan.example.coursebooking.Projections;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForCustomer", types = Customer.class)
public interface EmbedCustomer {
    String getName();
    String getTown();
    int getAge();
    List<Booking> getBookings();
}
