package org.hibernate.tutorial;

import org.hibernate.Session;

import java.util.*;

import org.hibernate.tutorial.domain.Event;
import org.hibernate.tutorial.util.HibernateUtil;

public class EventManager {

    public static void main(String[] args) {
        EventManager mgr = new EventManager();

        if (args[0].equals("store")) {
            mgr.createAndStoreEvent("My Event");
        }

        HibernateUtil.getSessionFactory().close();
    }

    private void createAndStoreEvent(String title) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Event theEvent = new Event();
        theEvent.setTitle(title);
        
        /* 
         * Calendars can't be stored in datetime fields, and Dates can't be stored in timestamp fields. So that reduces 
         * some of the options we need to test.
         */
        Calendar systemCalendar = Calendar.getInstance();
        theEvent.setSystemCalendarTimestamp(systemCalendar);
        Date systemDate = new Date();
        theEvent.setSystemDateDatetime(systemDate);
        
        Calendar utcCalendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        theEvent.setUtcCalendarTimestamp(utcCalendar);
        Date utcDate = utcCalendar.getTime();
        theEvent.setUtcDateDatetime(utcDate);
        
        session.save(theEvent);

        session.getTransaction().commit();
    }

}

