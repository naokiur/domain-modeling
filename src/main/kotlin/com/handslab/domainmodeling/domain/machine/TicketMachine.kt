package com.handslab.domainmodeling.domain.machine

import com.handslab.domainmodeling.domain.user.HeldMoney

class TicketMachine {
    fun createTicket(heldMoney: HeldMoney): Ticket {
        return Ticket(TicketName("test"), TicketPrice(100))
    }
}