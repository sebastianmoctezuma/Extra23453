package com.example.extraordinaro_23453.ui.theme.extra
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable




// se usa serializable porue se tienen que mostrar multiples datos que vienen de la misma fuente en diferentes vistas


@Serializable
object Inicio
@Serializable
object ListaDragones

@Preview(showBackground = true)
@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Inicio){
        composable<Inicio>{  //son tipo ruta los composable toncesse ponen igual a como establecimos los objetos
            ListaDragones(navController)
        }

        composable<Dragmodels>{  //va la lista de nuestros datos
            val dragon: Dragmodels= it.toRoute<Dragmodels>()    //se envia que dragon fue eleccionado
            UnDragon(navegante = navController,dragon)
        }
    }
}

