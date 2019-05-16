package com.handslab.domainmodeling.ticketmachine

import com.handslab.domainmodeling.ticketmachine.domain.machine.*
import com.handslab.domainmodeling.ticketmachine.domain.user.HeldMoney
import com.handslab.domainmodeling.ticketmachine.domain.user.User

fun main(args: Array<String>) {
    val initialTicket = Ticket(
        TicketName("test"),
        TicketPrice(1000)
    )
    val machine = TicketMachine(
        listOf(initialTicket),
        Money(1000000)
    )

    val user = User(
        HeldMoney(100)
    )
    val ticket = machine.createTicket(user.heldMoney)

    user.recieveTicket(ticket)
    println(user)
}