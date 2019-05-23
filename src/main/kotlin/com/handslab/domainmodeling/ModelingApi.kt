package com.handslab.domainmodeling

import com.handslab.domainmodeling.psyllium.Psyllium
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.DefaultHeaders
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty


fun Application.api() {
    val psyllium = Psyllium()
    install(DefaultHeaders)
    routing {
        get("/") {
            call.respondText("Hello, Ktor!")
        }
        get("/light/on") {
            psyllium.lightOn()
            call.respondText(psyllium.status)
        }
        get("/light/off") {
            psyllium.lightOff()
            call.respondText(psyllium.status)
        }
    }
}