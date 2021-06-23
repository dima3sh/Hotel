package org.azati.cources.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Guest extends Person{
    private Integer room_id;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Integer invoice = 0;

    public Guest(String name, String phoneNumber, String emailAddress, Integer room_id,
                 LocalDateTime departureTime, LocalDateTime arrivalTime) {
        super(name, phoneNumber, emailAddress);
        this.room_id = room_id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "room_id=" + room_id +
                ", departureTime='" + departureTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ", invoice=" + invoice +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;
        Guest guest = (Guest) o;
        return Objects.equals(room_id, guest.room_id) && Objects.equals(departureTime, guest.departureTime)
                && Objects.equals(arrivalTime, guest.arrivalTime) && Objects.equals(invoice, guest.invoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room_id, departureTime, arrivalTime, invoice);
    }
}
