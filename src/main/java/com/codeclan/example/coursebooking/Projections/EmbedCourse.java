package com.codeclan.example.coursebooking.Projections;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Models.Course;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedForCourse", types = Course.class)
public interface EmbedCourse {
    String getName();
    String getTown();
    int getRating();
    List<Booking> getBookings();
}
