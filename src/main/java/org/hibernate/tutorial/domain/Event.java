package org.hibernate.tutorial.domain;

import java.util.Calendar;
import java.util.Date;

public class Event {
    
    private Long id;

    private String title;
    
    private Calendar systemCalendarTimestamp;

    private Calendar utcCalendarTimestamp;

    private Date systemDateDatetime;
    
    private Date utcDateDatetime;

    public Event() {}

    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }
  
    public Calendar getSystemCalendarTimestamp() {
        return this.systemCalendarTimestamp;
    }
    
    public void setSystemCalendarTimestamp(Calendar systemCalendar) {
        this.systemCalendarTimestamp = systemCalendar;
    }
    
    public Calendar getUtcCalendarTimestamp() {
        return this.utcCalendarTimestamp;
    }
    
    public void setUtcCalendarTimestamp(Calendar utcCalendar) {
        this.utcCalendarTimestamp = utcCalendar;
    }
    
    public Date getSystemDateDatetime() {
        return systemDateDatetime;
    }

    public void setSystemDateDatetime(Date date) {
        this.systemDateDatetime = date;
    }
    
    public Date getUtcDateDatetime() {
        return this.utcDateDatetime;
    }
    
    public void setUtcDateDatetime(Date utcDate) {
        this.utcDateDatetime = utcDate;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}