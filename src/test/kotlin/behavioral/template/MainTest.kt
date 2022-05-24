package behavioral.template

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MainTest {
    @Test
    fun testTemplateCricketWorking() {
        val cricket: Game = Cricket()
        assertNotNull(cricket.play())
    }

    @Test
    fun testTemplateFootballWorking() {
        val football: Game = Football()
        assertNotNull(football.play())
    }

    @Test
    fun testCricketInitializeMessage(){
        val cricket = Cricket()
        assertEquals("Cricket game initialized! Start playing", cricket.initialize())
    }

    @Test
    fun testCricketInitializeWrongMessage(){
        val cricket = Cricket()
        assertNotEquals("Football game initialized! Start playing", cricket.initialize())
    }
}