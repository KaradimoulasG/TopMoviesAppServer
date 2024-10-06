package com.example.common

import com.example.models.Movie

object Constants {

    const val NEXT_PAGE_KEY = "nextPageKey"
    const val PREVIOUS_PAGE_KEY = "previousPageKey"

    const val NUMBERS_ONLY_EXCEPTION = "Only numbers allowed"
    const val MOVIES_NOT_FOUND_EXCEPTION = "Movies not Found"

    const val IMDB_LINK = "https://www.imdb.com/title"

    val page1 = listOf(
        Movie(
            id = 1,
            name = "The Shawshank Redemption",
            image = "/images/the_shawshank_redemption.jpg",
            description = "A banker convicted of uxoricide forms a friendship over a quarter century with a hardened convict, while maintaining his innocence and trying to remain hopeful through simple compassion.",
            rating = 4.6,
            imdbRating = 9.3,
            imdbLink = "$IMDB_LINK/tt0111161/?ref_=chttp_t_1",
            director = "Frank Darabont",
            writers = listOf("Stephen King", "Frank Darabont"),
            topCast = listOf("Tim Robbins", "Morgan Freeman", "Bob Gunton", "Wiliam Sadler", "Clancy Brown", "Gil Bellows")
        ),
        Movie(
            id = 2,
            name = "The Godfather",
            image = "/images/the_godfather.jpg",
            description = "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.",
            rating = 4.6,
            imdbRating = 9.2,
            imdbLink = "$IMDB_LINK/tt0068646/?ref_=chttp_t_2",
            director = "Francis Ford Coppola",
            writers = listOf("Mario Puzo", "Francis Ford Coppola"),
            topCast = listOf("Marlon Brando", "Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall")
        ),
        Movie(
            id = 3,
            name = "The Dark Knight",
            image = "/images/the_dark_knight.jpg",
            description = "When a menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman, James Gordon and Harvey Dent must work together to put an end to the madness.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0468569/?ref_=chttp_t_3",
            director = "Christopher Nolan",
            writers = listOf("Christopher Nolan", "Jonathan Nolan", "David S. Goyer"),
            topCast = listOf("Christian Bale", "Heath Ledger", "Aaron Ekchart", "Michael Caine", "Gary Oldman")
        ),
        Movie(
            id = 4,
            name = "The Godfather Part 2",
            image = "/images/the_godfather_2.jpg",
            description = "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0071562/?ref_=chttp_t_4",
            director = "Francis Ford Coppola",
            writers = listOf("Mario Puzo", "Francis Ford Coppola"),
            topCast = listOf("Al Pacino", "James Caan", "Richard S. Castellano", "Robert Duvall")
        ),
        Movie(
            id = 5,
            name = "12 Angry Men",
            image = "/images/12_angry_men.jpg",
            description = "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0050083/?ref_=chttp_t_5",
            director = "Sidney Lumet",
            writers = listOf("Reginald Rose"),
            topCast = listOf("Henry Foda", "Lee J. Cobb", "Martin Balsam")
        ),

    )
    val page2 = listOf(
        Movie(
            id = 6,
            name = "The Lord of the Rings: The Return of the King",
            image = "/images/the_return_of_the_king.jpg",
            description = "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0167260/?ref_=chttp_t_6",
            director = "Peter Jackson",
            writers = listOf("J.R.R Tolkien", "Fran Walsh", "Phillipa Boyens"),
            topCast = listOf("Elijah Woods", "Vigo Mortesen", "Ian McKellen", "Orlando Bloom", "Alistair Browning", "Sean Bean")
        ),
        Movie(
            id = 7,
            name = "Schindler's List",
            image = "/images/schindlers_list.jpg",
            description = "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0108052/?ref_=chttp_t_7",
            director = "Steven Spielberg",
            writers = listOf("Thomas Keneally", "Steven Zailian"),
            topCast = listOf("Liam Neeson", "Ralph Fienes", "Ben Kingsley")
        ),
        Movie(
            id = 8,
            name = "Pulp Fiction",
            image = "/images/pulp_fiction.jpg",
            description = "The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.",
            rating = 4.4,
            imdbRating = 8.9,
            imdbLink = "$IMDB_LINK/tt0110912/?ref_=chttp_t_8",
            director = "Quentin Tarantino",
            writers = listOf("Quentin Tarantino", "Roger Avary"),
            topCast = listOf("John Travolta", "Uma Thurman", "Samuel L. Jackson")
        ),
        Movie(
            id = 9,
            name = "The Lord of the Rings: The Fellowship of the Ring",
            image = "/images/the_fellowship_of_the_ring.jpg",
            description = "A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle-earth from the Dark Lord Sauron.",
            rating = 4.4,
            imdbRating = 8.9,
            imdbLink = "$IMDB_LINK/tt0120737/?ref_=chttp_t_9",
            director = "Peter Jackson",
            writers = listOf("J.R.R Tolkien", "Fran Walsh", "Phillipa Boyens"),
            topCast = listOf("Elijah Woods", "Vigo Mortesen", "Ian McKellen", "Orlando Bloom", "Alistair Browning", "Sean Bean")
        ),
        Movie(
            id = 10,
            name = "The Good, The Bad, and the Ugly",
            image = "/images/the_good_the_bad_and_the_ugly.jpg",
            description = "A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.",
            rating = 4.4,
            imdbRating = 8.8,
            imdbLink = "$IMDB_LINK/tt0060196/?ref_=chttp_t_10",
            director = "Sergio Leone",
            writers = listOf("Luciano Vincenzoni", "Sergio Leone", "Agenore Incrocci"),
            topCast = listOf("Clint Eastwood", "Eli Wallach", "Lee Van Cleef")
        )
    )
    val page3 = listOf(
        Movie(
            id = 11,
            name = "Forrest Gump",
            image = "/images/forrest_gump.jpg",
            description = "The history of the United States from the 1950s to the '70s unfolds from the perspective of an Alabama man with an IQ of 75, who yearns to be reunited with his childhood sweetheart.",
            rating = 4.4,
            imdbRating = 8.8,
            imdbLink = "$IMDB_LINK/tt0109830/?ref_=chttp_t_11",
            director = "Robert Zemeckis",
            writers = listOf("Winston Groom", "Eric Roth"),
            topCast = listOf("Tom Hanks", "Robin Wright", "Gary Sinise")
        ),
        Movie(
            id = 12,
            name = "The Lord of the Rings: The Two Towers",
            image = "/images/the_two_towers.jpg",
            description = "While Frodo and Sam edge closer to Mordor with the help of the shifty Gollum, the divided fellowship makes a stand against Sauron's new ally, Saruman, and his hordes of Isengard.",
            rating = 4.4,
            imdbRating = 8.8,
            imdbLink = "$IMDB_LINK/tt0167261/?ref_=chttp_t_12",
            director = "Peter Jackson",
            writers = listOf("J.R.R Tolkien", "Fran Walsh", "Phillipa Boyens"),
            topCast = listOf("Elijah Woods", "Vigo Mortesen", "Ian McKellen", "Orlando Bloom", "Alistair Browning")
        ),
        Movie(
            id = 13,
            name = "Fight Club",
            image = "/images/fight_club.jpg",
            description = "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.",
            rating = 4.4,
            imdbRating = 8.8,
            imdbLink = "$IMDB_LINK/tt0109830/?ref_=chttp_t_11",
            director = "David Fincher",
            writers = listOf("Chuck Palahniuk", "Jim Uhls"),
            topCast = listOf("Brad Pitt", "Edward Norton", "Meat Loaf")
        ),
        Movie(
            id = 14,
            name = "Inception",
            image = "/images/inception.jpg",
            description = "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O., but his tragic past may doom the project and his team to disaster.",
            rating = 4.4,
            imdbRating = 8.8,
            imdbLink = "$IMDB_LINK/tt1375666/?ref_=chttp_t_14",
            director = "Christopher Nolan",
            writers = listOf("Christopher Nolan"),
            topCast = listOf("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Elliot Page")
        ),
        Movie(
            id = 15,
            name = "Star Wars: Episode V - The Empire Strikes Back",
            image = "/images/the_empire_strikes_back.jpg",
            description = "After the Empire overpowers the Rebel Alliance, Luke Skywalker begins his Jedi training with Yoda. At the same time, Darth Vader and bounty hunter Boba Fett pursue his friends across the galaxy.",
            rating = 4.3,
            imdbRating = 8.7,
            imdbLink = "$IMDB_LINK/tt0080684/?ref_=chttp_t_15",
            director = "Irvin Kershner",
            writers = listOf("Leigh Brackett", "Lawrence Kasdan", "George Lucas"),
            topCast = listOf("Mark Hamill", "Harrison Ford", "Carrie Fisher")
        )
    )
    val page4 = listOf(
        Movie(
            id = 5,
            name = "12 Angry Men",
            image = "/images/12_angry_men.jpg",
            description = "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0050083/?ref_=chttp_t_5",
            director = "Sidney Lumet",
            writers = listOf("Reginald Rose"),
            topCast = listOf("Henry Foda", "Lee J. Cobb", "Martin Balsam")
        )
    )
    val page5 = listOf(
        Movie(
            id = 5,
            name = "12 Angry Men",
            image = "/images/12_angry_men.jpg",
            description = "The jury in a New York City murder trial is frustrated by a single member whose skeptical caution forces them to more carefully consider the evidence before jumping to a hasty verdict.",
            rating = 4.5,
            imdbRating = 9.0,
            imdbLink = "$IMDB_LINK/tt0050083/?ref_=chttp_t_5",
            director = "Sidney Lumet",
            writers = listOf("Reginald Rose"),
            topCast = listOf("Henry Foda", "Lee J. Cobb", "Martin Balsam")
        )
    )
}