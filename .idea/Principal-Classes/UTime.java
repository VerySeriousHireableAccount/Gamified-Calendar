//Author: Levent Batakci
//This is just to enforce our conventions for storing and manipulating times
//Time is stored as UNIX time - the number of seconds since jan 1, 1970

class UTime implements Comparable {

    //The time, stored in seconds since jan 1, 1970
    long time;

    //Initializes time as the current time]
    public UTime()
    {
        time = System.currentTimeMillis() / 1000;
    }

    public int compareTo(Time other)
    {
        long d = duration(this, other);
        return (d==0 ? 0 : (d>0 ? -1 : 1) );

    }
    //Initializes time as the given value
    public UTime(long _time)
    {
        time = _time;
    }

    //Get the time
    public long getTime()
    {
        return time;
    }

    //Set the time
    public long setTime(long _time)
    {
        time = _time;
    }

    static long duration(UTime start, UTime end)
    {
        return (start.time-end.time);
    }
}