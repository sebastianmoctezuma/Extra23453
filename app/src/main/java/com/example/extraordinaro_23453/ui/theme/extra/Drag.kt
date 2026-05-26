package com.example.extraordinaro_23453.ui.theme.extra

import androidx.lifecycle.ViewModel
import com.example.extraordinaro_23453.R

class Drag : ViewModel(){
    fun getDragon(): List<Dragmodels>
    {
        //en este caso es una lista fija y no mutable por lo tanto se ingresan como variables cada dragon,
        // el nombre de la variable no afecta simplemente pos que no se repita

        //si nos vuelve a pasar datos asi recomiendo usen ctrl+f por si no se les habi ocurido

        val dragona= Dragmodels(num = 1, Nombre = "Spiderman 3",Apodo = "Superheroes",
            Entrenable = "160 min",
            Clase = "Marejada",
            Descripcion = "Este solitario dragon habita en cuevas y estanques marinos, " +
                    "si se le molesta puede producir un golpe de sonido que mata hombres a corta distancia",
            Recomendacion = "Tirar  a Matar",
            "En extremo peligroso",
            Imagen_01 = R.drawable.trueno01,
            Imagen_02 = R.drawable.trueno02,
            R.drawable.marejeada)
        val dragonb= Dragmodels(num = 2, Nombre = "Cortaleña",
            Apodo = "Trepatroncos",
            Entrenable = "Sí",
            Clase = "Afilada",
            Descripcion = "Esta enorme criatura tiene alas afiladas que pueden cortar árboles maduros",
            Recomendacion = "Tirar  a Matar",
            NiveldePeligro = "En extremo peligroso",
            Imagen_01 = R.drawable.cortalena01,
            Imagen_02 = R.drawable.cortalena02,
            ClaseImg = R.drawable.afilada)
        val dragonc= Dragmodels(3,
            Nombre= "Caldero",
            Apodo= "Scauldy",
            Entrenable= "Sí",
            Clase= "Marejada",
            Descripcion= "Rocía agua hirviendo a sus víctimas",
            Recomendacion= "Portar escudo y Tirar  a Matar",
            NiveldePeligro= "En extremo peligroso",
            Imagen_01= R.drawable.caldero01,
            Imagen_02= R.drawable.caldero02,
            R.drawable.marejeada)
        val dragond= Dragmodels(4,
            Nombre= "Metamorfala",
            Apodo="",
            Entrenable= "No",
            Clase= "Misterio",
            Descripcion=  "Recién salidos del huevo ya rocían ácido",
            Recomendacion="Tirar  a Matar",
            "Sumamente Peligroso",
            Imagen_01= R.drawable.metamorfala01,
            Imagen_02= R.drawable.metamorfala02,
            R.drawable.misterio)
        val dragone= Dragmodels(5,
            Nombre= "Muerte Susurrante",
            Apodo= "Dientes",
            Entrenable= "No",
            Clase= "Piedra",
            Descripcion=  "Asfixia a sus víctimas, las entierra, las quema, las voltea como a calcetines",
            Recomendacion= "Tirar  a Matar",
            "En extremo peligroso",
            Imagen_01= R.drawable.muerte01,
            Imagen_02= R.drawable.muerte02,
            R.drawable.piedra)
        val dragonf= Dragmodels(6,
            Nombre= "Furia Nocturna",
            Apodo= "Chimuelo // Dientes",
            Entrenable= "Sí",
            Clase= "Embestida",
            Descripcion= "Rapidez= Desconocida" +
                    "        \nTamaño= Desconocido" +
                    "        \nLa cría maligna del relámpago y la muerte misma. Nunca enfrentar a este dragon.",
            Recomendacion= "Tu única salida: Esconderte e implorar que no te encuentre",
            "S+++",
            Imagen_01= R.drawable.furia01,
            Imagen_02= R.drawable.furia02,
            R.drawable.embestida
        )

        val dmodels =listOf<Dragmodels>(dragona,dragonb,dragonc,dragond,dragone,dragonf) //designamos la variable en la que se envian los datos

        return dmodels
    }
}