package com.handslab.domainmodeling.psyllium

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.CoreMatchers.instanceOf
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class PsylliumTest {

    @Test
    fun testNothingToRed() {
        val psylium = Psyllium()

        psylium.lightOn()
        assertThat(psylium.status, instanceOf(LightOnStatus))
    }

    @Test
    fun testRedToBlue() {
        val psylium = Psyllium()

        psylium.lightOn()
        psylium.lightOn()

        assertThat(psylium.status, equalTo(Status.BLUE))
    }

    @Test
    fun testBlueToRed() {
        val psylium = Psyllium()

        psylium.lightOn()
        psylium.lightOn()
        psylium.lightOn()

        assertThat(psylium.status, equalTo(Status.RED))
    }

    @Test
    fun testRedToNothing() {
        val psylium = Psyllium()

        psylium.lightOn()
        psylium.lightOff()

        assertThat(psylium.status, equalTo(Status.NOTHING))
    }

    @Test
    fun testBlueToNothing() {
        val psylium = Psyllium()

        psylium.lightOn()
        psylium.lightOn()
        psylium.lightOff()

        assertThat(psylium.status, equalTo(Status.NOTHING))
    }

    @Test
    fun testNothingToNothing() {
        val psylium = Psyllium()

        psylium.lightOff()

        assertThat(psylium.status, equalTo(Status.NOTHING))
    }
}