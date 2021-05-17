package com.example.event;

public class AddEventDto {
    private String eventName;
    private String eventDomain;
    private String eventCity;
    private String eventDate;

    public AddEventDto(String eventName, String eventDomain, String eventCity, String eventDate, String eventTime, String eventTicketPrice) {
        this.eventName = eventName;
        this.eventDomain = eventDomain;
        this.eventCity = eventCity;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventTicketPrice = eventTicketPrice;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDomain() {
        return eventDomain;
    }

    public void setEventDomain(String eventDomain) {
        this.eventDomain = eventDomain;
    }

    public String getEventCity() {
        return eventCity;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventTicketPrice() {
        return eventTicketPrice;
    }

    public void setEventTicketPrice(String eventTicketPrice) {
        this.eventTicketPrice = eventTicketPrice;
    }

    private String eventTime;
    private String eventTicketPrice;

    @Override
    public String toString() {
        return "AddEventDto{" +
                "eventName='" + eventName + '\'' +
                ", eventDomain='" + eventDomain + '\'' +
                ", eventCity='" + eventCity + '\'' +
                ", eventDate='" + eventDate + '\'' +
                ", eventTime='" + eventTime + '\'' +
                ", eventTicketPrice='" + eventTicketPrice + '\'' +
                '}';
    }
}
