package com.example.extraordinario_23453.ui.theme.peliculas
import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DetallePeliculaView(
    navController: NavController,
    pelicula: DetallePelicula
) {
    val adultos = remember { mutableStateOf("") }
    val niños = remember { mutableStateOf("") }
    val total = remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Image(
                painter = painterResource(id = pelicula.imagen),
                contentDescription = pelicula.titulo,
                modifier = Modifier
                    .width(220.dp)
                    .height(260.dp),
                contentScale = ContentScale.FillBounds
            )
            Spacer(modifier = Modifier.height(10.dp))
            Column() {
                Text(text = pelicula.titulo, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(10.dp))
                Text(text = "Duración")
                Text(text = "${pelicula.duracion}")
                Spacer(modifier = Modifier.height(25.dp))
            }
        }
        Text(text = "Poner cantidad de boletos")
        Spacer(modifier = Modifier.height(15.dp))

        Column() {
            TextField(value = adultos.value, onValueChange = { adultos.value = it }, label = { Text("Adultos $84") }, modifier = Modifier.width(150.dp))
            Spacer(modifier = Modifier.height(15.dp))
            TextField(value = niños.value, onValueChange = { niños.value = it }, label = { Text("Niños $69") }, modifier = Modifier.width(150.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { val precioAdultos = adultos.value.toIntOrNull() ?: 0
                val precioNiños = niños.value.toIntOrNull() ?: 0
                total.value = (precioAdultos * 84) + (precioNiños * 69)
            }
        ) {
            Text(text = "Continuar", modifier = Modifier.width(300.dp))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Total a pagar: $${total.value}")
    }
}