package org.example.service;

import org.example.model.Ticket;

public interface TicketNotificationService {

    void sendToQueue(Ticket ticket);
}
