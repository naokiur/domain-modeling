package com.handslab.domainmodeling.psyllium

class Psyllium(
    var status: Status = LightOffStatus()
) {
    fun lightOn() {
        val stat = status
        status = when (stat) {
            is LightOffStatus -> LightOnStatus(Color.RED)
            is LightOnStatus -> {
                when (stat.color) {
                    Color.RED -> LightOnStatus(Color.BLUE)
                    Color.BLUE -> LightOnStatus(Color.RED)
                }
            }
            else -> LightOffStatus()
        }
    }
    fun lightOff() {
        status = LightOffStatus()
    }
//        var nintino = when (status) {
//            is LightOffStatus -> {
//                LightOnStatus(Color.RED)
//            }
//            is LightOnStatus -> {
//                when (status.color) {
//                    Color.RED -> Status.LightOn(Color.BLUE)
//                }
//            }
//            Status.BLUE -> Status.RED
//        }
//    }
}
