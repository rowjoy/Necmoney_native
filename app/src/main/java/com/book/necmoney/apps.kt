package com.book.necmoney

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.book.necmoney.ui.theme.NecMoneyTheme
import com.book.necmoney.views.SplashScreenView
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun MyApp(){
    var showSplashScreen by remember { mutableStateOf(true) }
    NecMoneyTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ){
          if(showSplashScreen){
              SplashScreenView {
                  showSplashScreen = false;
              }
          }else {
              MainScreen()
          }
        }
    }
}



@Composable
fun MainScreen(){
    Text(text = "Welcome to the Main Screen!")
}