package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CalenderEventTests {

    @Test
    void initializedCorrectlyWithUTimes(){
        UTime t1 = new UTime(1);
        UTime t2 = new UTime(2);
        String name = "Test Name";

        CalendarEvent e = new CalendarEvent(name, t1, t2);
        assertEquals(e.getEventName(),name);
        assertEquals(e.getEventTime().startTime,t1);
        assertEquals(e.getEventTime().endTime,t2);
    }

    @Test
    void initializedCorrectlyWithEventTime(){
        UTime t1 = new UTime(1);
        UTime t2 = new UTime(2);
        String name = "Test Name";

        CalendarEvent e = new CalendarEvent(name, new EventTime(t1,t2));
        assertEquals(e.getEventName(),name);
        assertEquals(e.getEventTime().startTime,t1);
        assertEquals(e.getEventTime().endTime,t2);
    }

    @Test
    void initializedCorrectlyWithDesc(){
        UTime t1 = new UTime(1);
        UTime t2 = new UTime(2);
        String name = "Test Name";
        String desc = "testing desc";

        CalendarEvent e = new CalendarEvent(name, new EventTime(t1,t2), desc);
        assertEquals(e.getEventName(),name);
        assertEquals(e.getEventTime().startTime,t1);
        assertEquals(e.getEventTime().endTime,t2);
        assertEquals(e.getEventDescription(),desc);
    }

    @Test
    void inTimeRange(){

        UTime t1 = new UTime(5);
        UTime t2 = new UTime(8);
        String name = "Test Name";

        CalendarEvent e = new CalendarEvent(name, new EventTime(t1,t2));

        UTime t3 = new UTime(4);
        UTime t4 = new UTime(9);
        UTime t5 = new UTime(3);
        UTime t6 = new UTime(7);
        UTime t7 = new UTime(10);
        assertTrue(e.isInTimeRange(t3,t4));
        assertTrue(e.isInTimeRange(t3,t6));
        assertFalse(e.isInTimeRange(t5,t3));
        assertFalse(e.isInTimeRange(t4,t7));
    }

}
