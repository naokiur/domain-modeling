package com.handslab.domainmodeling.domain.user

import com.handslab.domainmodeling.domain.machine.Ticket

class User(
    val heldMoney: HeldMoney
) {
    fun recieveTicket(ticket: Ticket) {
        println(ticket)
    }
}
