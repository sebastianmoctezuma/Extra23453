package com.example.extraordinario_23453.ui.theme.peliculas

import com.example.extraordinaro_23453.R
import kotlinx.serialization.Serializable

@Serializable
data class MovieModel(
    val titulo: String,
    val imagen: Int,
    val duracion: String,
    val genero: String
)

fun getMovies(): List<MovieModel> {
    return listOf(
        MovieModel("Iron Man 1 ", R.drawable.ironman, "2h 6m", "Acción"),
        MovieModel("Capitan America: El soldado del invierno", R.drawable.capitanamerica, "2h 16m", "Acción"),
        MovieModel("Interestellar", R.drawable.interestellar, "2h 49m", "Fantasia"),
        MovieModel("Spiderman no way home", R.drawable.spiderman, "2h 28m", "Acción"),
        MovieModel("Batman ", R.drawable.batman, "2h 56m", "Ficción")
    )
}