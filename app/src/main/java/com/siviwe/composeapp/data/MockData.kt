package com.siviwe.composeapp.data

data class Album(
    val id: Int,
    val artist: String,
    val name: String,
    val year: Int,
    val imageUrl: String
)

object Albums {
    val favAlbums = listOf(
        Album(
            1,
            "Lil Wayne",
            "Tha Carter 3",
            2008,
            "https://images-na.ssl-images-amazon.com/images/I/51L7OKqENRL._SX425_.jpg"

        ),
        Album(
            2,
            "Jay Z",
            "4:44",
            2017,
            "https://upload.wikimedia.org/wikipedia/commons/a/ac/4-44_album_cover.png"

        ),
        Album(
            3,
            "Kanye West",
            "Donda",
            2021,
            "https://www.okayplayer.com/wp-content/uploads/2021/08/you-can-finally-stream-kanye-wests-album-donda-featuring-jay-z-jay-electronica-westside-gunn-and-more.jpg"

        ),
        Album(
            4,
            "Jay Z",
            "The Blue Print",
            2001,
            "https://upload.wikimedia.org/wikipedia/en/2/2c/The_Blueprint.png"

        ),
        Album(
            5,
            "Kanye West",
            "Jesus is King",
            2019,
            "https://upload.wikimedia.org/wikipedia/en/a/a4/Kanye_West_-_Jesus_Is_King.png"

        ),
        Album(
            6,
            "Kendrick Lamar",
            "To Pimp a Butterfly",
            2015,
            "https://upload.wikimedia.org/wikipedia/en/f/f6/Kendrick_Lamar_-_To_Pimp_a_Butterfly.png"

        ),
        Album(
            7,
            "Kendrick Lamar",
            "DAMN",
            2017,
            "https://i1.sndcdn.com/artworks-000657703867-cm4g8h-t500x500.jpg"

        ),
        Album(
            8,
            "Baby Keem",
            "The Melodic Blue",
            2021,
            "https://www.rap-up.com/app/uploads/2021/09/baby-keem-the-melodic-blue.jpg"

        ),
        Album(
            9,
            "Lil Wayne",
            "Tha Carter 4",
            2011,
            "https://images-na.ssl-images-amazon.com/images/I/71%2Bf5POK2cL._SL1097_.jpg"

        ),
        Album(
            10,
            "Nas",
            "Illmatic",
            1994,
            "https://media.pitchfork.com/photos/5929c199c0084474cd0c337b/1:1/w_600/111d1a3b.jpg"

        ),
        Album(
            11,
            "Chance The Rapper",
            "Coloring Book",
            2016,
            "https://media.pitchfork.com/photos/5929b5bb13d197565213ace9/1:1/w_600/c5e30897.jpg"

        ),
    )
}