package movie_rental

enum class MovieType {
    CHILDREN {
        override fun renterPoints(): Int {
            return 1
        }
        override fun rentalAmount(): Double {
            return 1.50
        }
    },

    REGULAR {
        override fun renterPoints(): Int {
            return 1
        }
        override fun rentalAmount(): Double {
            return 1.50
        }
    },

    NEW_RELEASE {
        override fun renterPoints(): Int {
            return 2
        }
        override fun rentalAmount(): Double {
            return 2.50
        }
    };

    abstract fun renterPoints(): Int
    abstract fun rentalAmount(): Double
}