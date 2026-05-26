package com.example.extraordinaro_23453.ui.theme.extra

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.extraordinaro_23453.R

//IMAGEN B PARTE 2  la card individual

@Composable
fun CardDragon(navegante: NavHostController, dragon: Dragmodels){  //llamamos al DATA class
    Card(
        modifier = Modifier
            .height(250.dp)
            .fillMaxWidth()
            .padding(3.dp)
            .clickable { navegante.navigate(route = dragon) },  //que se pueda seleccionar y envie al dragon elegido
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

                Image(
                    painter = painterResource(dragon.Imagen_01),
                    contentDescription = "imagen de Fondo",
                    contentScale = ContentScale.FillBounds, //ocup toda el area designada en size, height o width
                    modifier = Modifier
                        .height(250.dp)
                        .fillMaxWidth()
                )
                Text(dragon.Nombre, fontSize = 20.sp, textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Black),
                    color = Color.White)

        }

    }

}








//esto era para poder ver por si algo les falla, si hacen preview tienen que asignar todas las variables o no sirve
@Preview(showBackground = true)
@Composable
fun Previewdelacosa(){
    val navControl= rememberNavController()
    val dragona= Dragmodels(num = 1, Nombre = "Trueno Tambor",Apodo = "Thornado",
        Entrenable = "Sí", Clase = "Marejada",
        Descripcion = "Este solitario dragon habita en cuevas y estanques marinos, si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
        Recomendacion = "Tirar  a Matar",
        "En extremo peligroso",
        Imagen_01 = R.drawable.trueno01,
        Imagen_02 = R.drawable.trueno02,
        R.drawable.marejeada)
    CardDragon(navControl,dragona)
}





