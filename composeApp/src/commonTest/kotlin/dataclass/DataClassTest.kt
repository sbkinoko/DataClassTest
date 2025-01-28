package dataclass

import domain.User
import domain.UserData
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class DataClassTest {
    private val name = "Taro"
    private val age = 20

    @Test
    fun equalUser() {
        val man1 = User(
            name = name,
            age = age,
        )

        val man2 = User(
            name = name,
            age = age,
        )

        val hash1 = man1.hashCode()
        val hash2 = man2.hashCode()

        assertNotEquals(man1, man2)
        assertNotEquals(hash1,hash2)

        man2.age++
        val hash3 = man2.hashCode()
        assertEquals(hash2,hash3)
    }

    @Test
    fun equalUserData() {
        val man1 = UserData(
            name = name,
            age = age,
        )
        val man2 = UserData(
            name = name,
            age = age,
        )

        val hash1 = man1.hashCode()
        val hash2 = man2.hashCode()

        assertEquals(man1, man2)
        assertEquals(hash1,hash2)

        man2.age++
        val hash3 = man2.hashCode()

        assertNotEquals(hash2,hash3)
        assertNotEquals(man1,man2)
    }
}
