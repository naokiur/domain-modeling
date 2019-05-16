package com.handslab.domainmodeling.ticketmachine.domain.machine

import com.handslab.domainmodeling.ticketmachine.domain.user.HeldMoney

class TicketMachine(val ticketList: List<Ticket>, val money: Money) {
    fun createTicket(heldMoney: HeldMoney): Ticket {
        return Ticket(
            TicketName(
                "test"
            ), TicketPrice(100)
        )
    }
}