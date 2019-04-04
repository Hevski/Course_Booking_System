package com.codeclan.example.coursebooking.Repositories.BookingRepositories;

import com.codeclan.example.coursebooking.Models.Booking;
import com.codeclan.example.coursebooking.Projections.EmbedBooking;
import com.codeclan.example.coursebooking.Projections.EmbedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedBooking.class)
public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    List<Booking> findBookingByDate(String date);

}
