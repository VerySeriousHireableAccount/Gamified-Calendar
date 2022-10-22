package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalendarTests {

    Calendar c;

    @Test
    void nameChangedCorrectly(){
        c = new Calendar();
        String name = "test 1";
        c.setCalendarName(name);
        assertEquals(c.getCalendarName(), name, "Name should have changed to 'test 1'");

        name = "";
        c.setCalendarName(name);
        assertEquals(c.getCalendarName(),name, "Name should have changed to empty");
    }

    static String default_calendar_name = "new calendar";
    @Test
    void nameInitializedCorrectlyToDefault(){
        c = new Calendar();
        assertEquals(c.getCalendarName(), default_calendar_name, "Name should have initialized as " + default_calendar_name);
    }

    @Test
    void nameInitializedCorrectly(){
        c = new Calendar();
        String name = "test name";
        Calendar c = new Calendar(name);
        assertEquals(c.getCalendarName(), name, "Name should have initialized as " + name);
    }

    @Test
    void addEvent(){
        c = new Calendar();
        UTime start = new UTime(0);
        UTime end = new UTime(10);
        CalendarEvent event = new CalendarEvent("Test event", new EventTime(start, end));

        c.addEvent(event);
        assertTrue(c.getEventList().contains(event));
    }

    @Test
    void RemoveEvent(){
        c = new Calendar();
        UTime start = new UTime(0);
        UTime end = new UTime(10);
        CalendarEvent event = new CalendarEvent("Test event", new EventTime(start, end));

        c.addEvent(event);
        assertTrue(c.getEventList().contains(event));
        c.removeEvent(event);
        assertFalse(c.getEventList().contains(event));
    }

    @Test
    void GetEventsInRange(){
        c = new Calendar();
        UTime t1 = new UTime(0);
        UTime t2 = new UTime(5);
        UTime t3 = new UTime(10);
        UTime t4 = new UTime(20);
        CalendarEvent event = new CalendarEvent("Test event", new EventTime(t1, t2));

        c.addEvent(event);
        assertTrue(c.getEventList().contains(event));

        assertFalse(c.getEventsInRange(t1,t2).isEmpty());
        assertFalse(c.getEventsInRange(t1,t3).isEmpty());
        assertTrue(c.getEventsInRange(t3,t4).isEmpty());
    }
}
