package com.example.TicketServiceMoneta.entity;

import java.time.LocalDateTime;

/**
 * Created by marek.vu on 16.05.2024.
 */

//nikde se neuklada takze neni potreba entity anotace id je promenlive tim myslim number atribut
public class Ticket {
    private Long number;
    private LocalDateTime timeStamp;
    private Long queuePosition;

    public Ticket(Long number, LocalDateTime timeStamp, Long queuePosition) {
        this.number = number;
        this.timeStamp = timeStamp;
        this.queuePosition = queuePosition;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getQueuePosition() {
        return queuePosition;
    }

    public void setQueuePosition(Long queuePosition) {
        this.queuePosition = queuePosition;
    }
}
