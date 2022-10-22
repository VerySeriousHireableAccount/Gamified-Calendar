package com.swe.gamifiedcalendar;

import com.swe.gamifiedcalendar.EventTime;
import com.swe.gamifiedcalendar.UTime;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class EventTimeTests {

    @Test
    void timeInitialization(){
        UTime t1 = new UTime(1);
        UTime t2 = new UTime(2);

        EventTime e = new EventTime(t1, t2);
        assertEquals(e.getEndTime(), t2);
        assertEquals(e.getStartTime(), t1);
    }

    @Test
    void fullRangeCheck(){
        UTime t1 = new UTime(5);
        UTime t2 = new UTime(8);
        UTime t3 = new UTime(4);
        UTime t4 = new UTime(9);
        UTime t5 = new UTime(6);

        EventTime e = new EventTime(t1, t2);
        assertTrue(e.fullyInRange(t3,t4));
        assertFalse(e.fullyInRange(t5,t4));
    }

    @Test
    void partialRangeCheck(){
        UTime t1 = new UTime(5);
        UTime t2 = new UTime(8);
        UTime t3 = new UTime(4);
        UTime t4 = new UTime(7);
        UTime t5 = new UTime(3);

        EventTime e = new EventTime(t1, t2);
        assertTrue(e.partiallyInRange(t3,t4));
        assertFalse(e.partiallyInRange(t5,t3));
    }
}
