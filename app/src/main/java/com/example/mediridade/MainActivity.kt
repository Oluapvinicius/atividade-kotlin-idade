package com.example.mediridade

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
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
    .height(132.dp),
    ) {

        Row(modifier = Modifier
           )
        {
        Button(onClick = {},
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

            Button(onClick = {},
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
    }
}

