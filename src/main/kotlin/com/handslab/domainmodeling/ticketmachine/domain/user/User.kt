package com.handslab.domainmodeling.ticketmachine.domain.user

import com.handslab.domainmodeling.ticketmachine.domain.machine.Ticket

class User(
    val heldMoney: HeldMoney
) {
    fun recieveTicket(ticket: Ticket) {
        println(ticket)
    }
}
