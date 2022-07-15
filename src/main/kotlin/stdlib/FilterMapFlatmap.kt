package stdlib

data class Album(val title: String,val name:String,val year:Int,val trackData:List<Track>)

data class Track(val title:String,val durationInSeconds:Int)

val albums = listOf(
    Album("yxd","wef",1992,
        listOf(
            Track("Spk",234),
        Track("spk",2345)
        )
     ),

)


