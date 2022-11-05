//Author: Levent Batakci
//This class represents the calendar object, which is responsible for
//storing and managing events

import java.util.ArrayList;
class Calendar {

    String calendarName = "new calendar";
    ArrayList<CalendarEvent> eventList;

    public Calendar() { }
    public Calendar(String calendarName) {
        this.calendarName = calendarName;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public ArrayList<CalendarEvent> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<CalendarEvent> eventList) {
        this.eventList = eventList;
    }

    public void addEvent(CalendarEvent event){
        eventList.add(event);
    }

    public void removeEvent(CalendarEvent event){
        eventList.remove(event);
    }

    public ArrayList<CalendarEvent> getEventsInRange(UTime start, UTime end){
        ArrayList<CalendarEvent> events = new ArrayList<CalendarEvent>();
        for(CalendarEvent e: eventList)
            if(e.isInTimeRange(start, end))
                events.add(e);
        return events;
    }
}