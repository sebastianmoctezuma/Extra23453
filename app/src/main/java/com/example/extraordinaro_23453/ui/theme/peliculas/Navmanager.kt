package com.example.extraordinario_23453.ui.theme.peliculas

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object ListaPeliculas

@Serializable
data class DetallePelicula(
    val titulo: String,
    val imagen: Int,
    val duracion: String
)
@Preview
@Composable
fun NavManager() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ListaPeliculas
    ) {
        composable<ListaPeliculas> {
            ListaPeliculasView(navController)
        }

        composable<DetallePelicula> {
            val pelicula: DetallePelicula = it.toRoute<DetallePelicula>()
            DetallePeliculaView(navController, pelicula)
        }
    }
}