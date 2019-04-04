package com.codeclan.example.coursebooking.Repositories.CustomerRepositories;

import com.codeclan.example.coursebooking.Models.Customer;
import com.codeclan.example.coursebooking.Repositories.BookingRepositories.BookingRepositoryCustom;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomerByCourseId(Long courseId){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Customer.class);
            cr.createAlias("bookings", "bookingAlias");
            cr.createAlias("bookingAlias.course", "course");
            cr.add(Restrictions.eq("course.id", courseId));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            return results;
        }
    }

}
