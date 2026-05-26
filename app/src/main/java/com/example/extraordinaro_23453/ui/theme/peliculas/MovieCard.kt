package com.example.extraordinario_23453.ui.theme.peliculas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun MovieCard(movie: MovieModel, onClick: () -> Unit) {
    Card(onClick = onClick, modifier = Modifier.width(160.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = movie.imagen), contentDescription = movie.titulo,
                modifier = Modifier.width(160.dp) .height(200.dp),
                contentScale = ContentScale.FillBounds
            )
            Text(text = movie.titulo, modifier = Modifier.padding(8.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(bottom = 8.dp)
            ) {
                Text(text = movie.duracion)
                Text(text = movie.genero)
            }
        }
    }
}