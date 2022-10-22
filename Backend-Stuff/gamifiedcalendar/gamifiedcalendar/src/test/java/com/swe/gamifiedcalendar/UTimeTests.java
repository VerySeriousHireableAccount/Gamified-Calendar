package com.swe.gamifiedcalendar;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class UTimeTests {

    @Test
    void timeInitialization(){
        long t = 120;
        UTime time = new UTime(t);
        assertEquals(t, time.getTime());
    }

    @Test
    void durationCheck(){
        long t1 = 10;
        long t2 = 100213;
        UTime time1 = new UTime(t1);
        UTime time2 = new UTime(t2);
        assertEquals(t2-t1, UTime.duration(time1, time2));
    }
}
