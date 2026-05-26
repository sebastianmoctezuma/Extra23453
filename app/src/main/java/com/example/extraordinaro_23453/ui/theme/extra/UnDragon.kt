package com.example.extraordinaro_23453.ui.theme.extra
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//IMAGEN C
@Composable
fun UnDragon(navegante: NavHostController,dragon: Dragmodels) {

    var result by remember{mutableStateOf("")} //para el regreso de los botones, no quise usar diferentes variables en ellos

    Column(Modifier
        .fillMaxSize()
        .padding(12.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally  //sin esto el texto no se alinea al centro btw
    ){
        //imagen dragon mediana
        Image(
            painter = painterResource(dragon.Imagen_02),
            contentDescription = "imagen de dragon mediana",
            //contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .padding(10.dp)
                .height(120.dp)
                .align(Alignment.CenterHorizontally)
        )
        //nombre
        Text(text = dragon.Nombre, fontSize = 18.sp, textAlign = TextAlign.Center)
        //clase
        Row(Modifier.fillMaxWidth()) {  //para que esten en la misma fila
            Text(text = "Clase: ${dragon.Clase} ", fontWeight = FontWeight.Bold)
            Image(
                painter = painterResource(dragon.ClaseImg),
                contentDescription = "imagen de la clase",
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.CenterVertically) ,
                contentScale = ContentScale.FillBounds
            )
        }
        //stats
        Column(Modifier.fillMaxWidth()) {
            Text(text = dragon.Descripcion)   //Descripcion del dragon
            Text(text = "\nNivel de Peligro: ${dragon.NiveldePeligro}", fontWeight = FontWeight.Bold)
            Row(Modifier.fillMaxWidth()) {  //entrenabilidad del dragon
                Text(text = "¿Se puede entrenar? ")
                Text(text = dragon.Entrenable, fontWeight = FontWeight.Bold)}
            Text(dragon.Recomendacion)

            //botones
            Text("¿Qué Haras?", fontSize = 16.sp,fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
            Row(Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly) {

                //da igual como escribas los if namas que asi lo sugiere el android studio

                //modelo es serial podemos comparar variables directamente
                Button(onClick = {
                    if (dragon.Nombre== "Furia Nocturna"){
                        result = "A este vikingo le decian 'el macho',porque murio de la forma mas macha posible"
                    }else {
                        result = "¡Ehorabuena! Derrotaste al dragon ${dragon.Nombre} pero perdiste una pierna"
                    }
                }) { Text("Luchar") }


                Button(onClick = {
                    result = if (dragon.Entrenable=="Sí"){
                        "Felicidades, Entrenaste a tu dragon y lo llamaste ${dragon.Apodo}"
                    }else{
                        "No pudiste entrenar al dragon y caiste en batalla"
                    }
                }) { Text("Entrenar") }

                Button(onClick = { navegante.popBackStack() }) {Text("Huir") }

            }
            Text(result)  //se mostrara unicamente cuando se halla visto uno de los botones

        }
    }
}

