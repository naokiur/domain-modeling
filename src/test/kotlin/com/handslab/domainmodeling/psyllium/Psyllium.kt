package com.handslab.domainmodeling.psyllium

class Psyllium(
    var status: Status = Status.NOTHING
) {
    fun lightOn() {
        status = when (status) {
            Status.NOTHING -> Status.RED
            Status.RED -> Status.BLUE
            Status.BLUE -> Status.RED
        }
    }
    fun lightOff() {
        status = Status.NOTHING
    }
}
