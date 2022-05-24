package creational.factory

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertNull

class RobotFactoryTest {
    private val robotFactory = RobotFactory()

    @Test
    fun whenGetRobotIsNull(){
        val result = robotFactory.getRobot("")
        assertNull(result)
    }

    @Test
    fun whenGetRobotIsNotNull(){
        val result = robotFactory.getRobot("door")
        assertNotNull(result)
    }

    @Test
    fun whenGetRobotIsNotInList(){
        val result = robotFactory.getRobot("rand")
        assertNull(result)
    }
}