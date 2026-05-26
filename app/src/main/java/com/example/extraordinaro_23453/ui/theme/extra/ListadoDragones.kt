package com.example.extraordinaro_23453.ui.theme.extra

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController


//IMAGEN B

@SuppressLint("ViewModelConstructorInComposable")  //para que siga siendo composable junto con el serial
@Composable
fun ListaDragones(navegante: NavHostController){
    val vm = Drag() //traemos el modelo donde estan registrados los datos  CLASS viewmodel

    Column(Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly) {
        Box(Modifier                        //para que la barra superior se mantenga estatica
            .fillMaxWidth()
            .size(45.dp)
            .padding(5.dp).align(Alignment.CenterHorizontally)) {

        }

        LazyColumn( Modifier.fillMaxSize().padding(10.dp),  //cuanto espacio con las paredes y la barra de arriba
            verticalArrangement = Arrangement.spacedBy(8.dp),   //cuanto espacio hay entre los elementos
            horizontalAlignment = Alignment.CenterHorizontally) {
            items(vm.getDragon()){  //se muestre card por cada dragon
                CardDragon(  //la vista con los settings del listado individual
                    navegante = navegante, it) } //se envie el dragon seleccionado
        }
    }
}
