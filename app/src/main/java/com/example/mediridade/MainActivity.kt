package com.example.mediridade

import android.R
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mediridade.ui.theme.MedirIdadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MedirIdadeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MedirIdade(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}



@Composable
fun MedirIdade( modifier: Modifier = Modifier) {
    var numero by remember { mutableStateOf(0) }

    var medirIdade =
        if (numero >= 18) {
            "Maior"
        } else {
            "Menor"
        }

    var validarIdade =
        if (numero < 0)
        {numero = 0
        }else if (numero > 180){
            numero = 180
        }else{
            numero
        }



    Column()
    {
        Spacer(modifier = Modifier.height(152.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(62.dp)

        ) {
            Text(
                modifier = Modifier
                    .align (Alignment.TopCenter)
                    ,
                text = "Qual é a sua idade?",
                fontSize = 30.sp,
                color = Color.Blue

            )
            Text(
                modifier = Modifier
                    .align (Alignment.BottomCenter),
                text = "Aperte os botoes para informar a sua idade"
            )
        }
Column(modifier = Modifier
    .fillMaxWidth()
    .height(172.dp),
    ) {
    Spacer(modifier = Modifier.height(20.dp))
    Box(modifier = Modifier
        .fillMaxWidth()

    ){
    Text(
        modifier= Modifier

            .align (Alignment.Center)
           ,
        text = "$validarIdade", fontSize = 30.sp
    )
    }
    Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier
            .fillMaxWidth(),

            horizontalArrangement = Arrangement.Center

           )

        {


        Button(onClick = { numero--},
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue
            ),

            modifier = Modifier
                .size(75.dp)


        ) {
            Icon(
                imageVector =  Icons.Default.KeyboardArrowDown,
                contentDescription = "Star")
        }

            Button(onClick = {numero++},
                shape = RoundedCornerShape(20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),

                modifier = Modifier
                    .size(75.dp)


            ) {
                Icon(
                    imageVector =  Icons.Default.Add,
                    contentDescription = "Star")
            }


        }
}
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier.align (Alignment.Center),
                text = "Voce é $medirIdade de idade",
                fontSize = 30.sp,
                color = Color.Blue

            )
        }
    }
}

