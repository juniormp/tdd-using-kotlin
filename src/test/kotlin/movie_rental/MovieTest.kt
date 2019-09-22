package movie_rental

import org.junit.Test
import kotlin.test.assertEquals

class MovieTest {

    @Test
    fun `It gets the movie rental amount for days rented`(){
        val movie = Movie("Sponge Bob", MovieType.CHILDREN)

        val rentalMovieAmount = movie.getRentalAmount(2)

        assertEquals(3.00, rentalMovieAmount)
    }

    @Test
    fun `It gets the movie renter points for days rented`(){
        val movie = Movie("Joker", MovieType.NEW_RELEASE)

        val renterPoints = movie.getRenterPoints(2)

        assertEquals(4, renterPoints)
    }
}