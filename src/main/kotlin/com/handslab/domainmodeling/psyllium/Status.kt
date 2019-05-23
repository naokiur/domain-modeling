package com.handslab.domainmodeling.psyllium

//sealed class Status {
//    data class LightOn(val color: Color): Status()
//    object LightOff: Status()
//}
//enum class Status(val color: Color) {
//    LIGHT_ON(Color),
//    LIGHT_OFF(Null)
//
//}

open class Status
class LightOnStatus(val color: Color): Status()
class LightOffStatus: Status()