/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.studenttimescedulerv2;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Hanno
 */
public class AddingEventWorker {

    private String eventName, eventType, eventDescription;
    private LocalDate eventDate;
    private LocalTime eventStart, eventEnd;
    private int eventReminder, eventPriority;

    public AddingEventWorker(String eventName, String eventType, String eventDescription, LocalDate eventDate, LocalTime eventStart, LocalTime eventEnd, int eventReminder, int eventPriority) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        this.eventReminder = eventReminder;
        this.eventPriority = eventPriority;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public LocalTime getEventStart() {
        return eventStart;
    }

    public LocalTime getEventEnd() {
        return eventEnd;
    }

    public int getEventReminder() {
        return eventReminder;
    }

    public int getEventPriority() {
        return eventPriority;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventStart(LocalTime eventStart) {
        this.eventStart = eventStart;
    }

    public void setEventEnd(LocalTime eventEnd) {
        this.eventEnd = eventEnd;
    }

    public void setEventReminder(int eventReminder) {
        this.eventReminder = eventReminder;
    }

    public void setEventPriority(int eventPriority) {
        this.eventPriority = eventPriority;
    }

    public String listEvent() {
        String list = eventName
                + "\n" + eventType
                + "\n" + eventDescription
                + "\n" + eventDate.toString()
                + "\n" + eventStart.toString()
                + "\n" + eventEnd.toString()
                + "\n" + String.valueOf(eventReminder)
                + "\n" + String.valueOf(eventPriority);
        return list;
    }

}
