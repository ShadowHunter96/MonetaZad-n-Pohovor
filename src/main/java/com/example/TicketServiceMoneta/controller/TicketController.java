package com.example.TicketServiceMoneta.controller;

import com.example.TicketServiceMoneta.entity.Ticket;
import com.example.TicketServiceMoneta.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by marek.vu on 16.05.2024.
 */


@RestController
@RequestMapping("/tickets-api")
@CrossOrigin("http://localhost:3001")
public class TicketController {


    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/generate")
    public Ticket generateTicket() {
        return ticketService.generateTicket();
    }

    @GetMapping("/current")
    public Ticket getCurrentTicket() {
        return ticketService.getCurrentTicket();
    }

    @DeleteMapping("/remove")
    public void removeCurrentTicket() {
        ticketService.removeCurrentTicket();
    }

    @GetMapping("/ticket-list")
    public List<Ticket> getTickets() {
        return ticketService.getTickets();
    }
}

