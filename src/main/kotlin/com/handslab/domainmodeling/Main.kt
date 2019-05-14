package com.handslab.domainmodeling

import com.handslab.domainmodeling.domain.machine.TicketMachine
import com.handslab.domainmodeling.domain.user.HeldMoney
import com.handslab.domainmodeling.domain.user.User

fun main(args: Array<String>) {
    val machine = TicketMachine()

    val user = User(HeldMoney(100))
    val ticket = machine.createTicket(user.heldMoney)

    user.recieveTicket(ticket)
    println(user)
}