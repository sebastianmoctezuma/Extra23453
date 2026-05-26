package com.example.extraordinaro_23453.ui.theme.extra
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.extraordinaro_23453.R


//IMAGEN A
@Composable
fun Inicioview(navegante: NavHostController){
    Box(Modifier.fillMaxSize()){  // en caja las cosas se muestran en capas, el ultimo sera el que ste hasta enfrente
        Image(painter = painterResource(R.drawable.libro),
            modifier = Modifier.fillMaxSize(),
            contentDescription = "libro",
            contentScale = ContentScale.FillBounds)
        OutlinedButton(
            onClick = {navegante.navigate(ListaDragones)},
            Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 8.dp)) {  //lista
            Text("Abrir",fontSize = 14.sp , textAlign = TextAlign.Center, color =Color.White ) }

    }
}

