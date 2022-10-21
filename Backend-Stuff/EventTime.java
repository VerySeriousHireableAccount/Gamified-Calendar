//Author: Levent Batakci
//
//This class describes when an event occurs.
//For instance it might encode that 'CSDS393 Lecture' occurs every Tuesday and Thursday from 10:00am-11:15am.
//That is, EvenTime need not describe just one contiguous chunk of time.

//Right now, we have a very basic implementation for the sake of the demo
class EventTime {

    UTime startTime;
    UTime endTime;
    public EventTime(UTime _startTime, UTime _endTime)
    {
        if( _endTime.compareTo(_startTime) < 0)
            throw new IllegalArgumentException();

        startTime = _startTime;
        endTime = _endTime;
    }

    //Returns true if any part of the event is in the range
    public boolean partiallyInRange(UTime start, UTime end)
    {
        return  (endTime.isBefore(end) && start.isBefore(endTime)) ||
                (start.isBefore(startTime) && startTime.isBefore((end))) ;
    }

    //Returns true if the full event is in the range
    public boolean fullyInRange(UTime start, UTime end)
    {
        return end.isBefore(end) && start.isBefore(startTime);
    }
}