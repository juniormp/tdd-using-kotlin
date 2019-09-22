package movie_rental

import org.junit.Test
import kotlin.test.assertEquals

class MovieTypeTest {

    @Test
    fun `It returns 1 renter point when movie type is children`(){
        val movieType = MovieType.CHILDREN

        val renterPoints = movieType.renterPoints()

        assertEquals(1, renterPoints)
    }

    @Test
    fun `It returns 1 renter points when movie type is regular`(){
        val movieType = MovieType.REGULAR

        val renterPoints = movieType.renterPoints()

        assertEquals(1, renterPoints)
    }

    @Test
    fun `It returns 2 renter points when movie type is new release`(){
        val movieType = MovieType.NEW_RELEASE

        val renterPoints = movieType.renterPoints()

        assertEquals(2, renterPoints)
    }

    @Test
    fun `The rental amount for children must be 1,50`(){
        val movieType = MovieType.CHILDREN

        val rentalAmount = movieType.rentalAmount()

        assertEquals(1.50, rentalAmount)
    }

    @Test
    fun `The rental amount for regular must be 1,50`(){
        val movieType = MovieType.REGULAR

        val rentalAmount = movieType.rentalAmount()

        assertEquals(1.50, rentalAmount)
    }

    @Test
    fun `The rental amount for new release must be 2,50`(){
        val movieType = MovieType.NEW_RELEASE

        val rentalAmount = movieType.rentalAmount()

        assertEquals(2.5, rentalAmount)
    }
}