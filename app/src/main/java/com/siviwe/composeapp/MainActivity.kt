package com.siviwe.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.coil.rememberCoilPainter
import com.siviwe.composeapp.data.Album
import com.siviwe.composeapp.data.Albums

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val albums = Albums.favAlbums
            AlbumList(albums = albums)
        }
    }
}

@Composable
fun AlbumList(albums: List<Album>){
    LazyColumn(){
        items(albums.size) { index ->
            AlbumItem(album = albums[index])
        }
    }
}

@Composable
fun AlbumItem(album: Album){
    Row(
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .fillMaxWidth()
    ){
        Column {
            Image(painter = rememberCoilPainter(request = album.imageUrl), contentDescription = album.name,
                modifier = Modifier.size(64.dp),
                contentScale = ContentScale.Crop
            )
        }
        Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 4.dp)) {
            Text(
                text = album.name,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = album.artist,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = album.year.toString(),
                fontWeight = FontWeight.Normal,
                fontSize = 10.sp,
                color = Color.Gray
            )
        }
    }
}





