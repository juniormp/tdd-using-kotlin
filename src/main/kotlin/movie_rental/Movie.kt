package movie_rental

class Movie(var name: String, var movieType: MovieType) {

    fun getRentalAmount(daysRented: Int): Double {
        return (daysRented * movieType.rentalAmount())
    }

    fun getRenterPoints(daysRented: Int): Int {
            return (movieType.renterPoints() * daysRented)
    }
}