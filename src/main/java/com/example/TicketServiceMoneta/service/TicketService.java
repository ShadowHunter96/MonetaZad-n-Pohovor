package com.example.TicketServiceMoneta.service;

import com.example.TicketServiceMoneta.entity.Ticket;
import org.springframework.stereotype.Service;

/*
 * Created by marek.vu on 16.05.2024.
 */

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

//jedina trida protoze mi prijde zbytecne davat nekam do repository tickety

@Service
public class TicketService {
    private final List<Ticket> tickets = new LinkedList<>();
    private Long currentNumber = 1245L;


    public Ticket generateTicket() {
        Long queuePosition = (long) tickets.size();
        Ticket ticket = new Ticket(currentNumber++, LocalDateTime.now(), queuePosition);
        tickets.add(ticket);
        return ticket;
    }
    // ziska aktualni ticket, pokud by se chtelo ziskat dle id bylo by za potrebi funkce findById v JpaRepository stejne jako pridat attribut nebo udelat funkci ziskat dle indexu
    public Ticket getCurrentTicket() {
        return tickets.isEmpty() ? null : tickets.get(0);
    }

    // smaze aktualni ticket a na základě toho přenastaví position
    public void removeCurrentTicket() {
        if (!tickets.isEmpty()) {
            tickets.remove(0);

            for (int i = 0; i < tickets.size(); i++) {
                tickets.get(i).setQueuePosition((long) i);
            }
        }
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
