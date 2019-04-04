package com.codeclan.example.coursebooking.Projections;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import com.codeclan.example.coursebooking.Models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedForBooking", types = Booking.class)
public interface EmbedBooking {
    String getDate();
    Course getCourse();
    Customer getCustomer();
}
