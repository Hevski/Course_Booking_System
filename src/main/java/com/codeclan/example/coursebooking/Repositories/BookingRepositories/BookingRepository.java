package com.codeclan.example.coursebooking.Repositories.BookingRepositories;

import com.codeclan.example.coursebooking.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

}
