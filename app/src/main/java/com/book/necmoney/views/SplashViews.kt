package com.book.necmoney.views


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.book.necmoney.R
import com.book.necmoney.ui.theme.greenColor
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.delay

@Composable
fun SplashScreenView ( onSplashScreenFinished: ()-> Unit){
    val scale = remember { Animatable(0f)}
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(
            color = greenColor
        )
    }
    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1.2f,
            animationSpec = tween(durationMillis = 300, easing = FastOutSlowInEasing)
        )
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 200, easing = FastOutSlowInEasing )
        )
        delay(1000)
        onSplashScreenFinished()
    }



    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(greenColor),
        contentAlignment = Alignment.Center,

    ){
       Image(
           painter = painterResource(id = R.drawable.necmoney_logo),
           contentDescription =  "App Logo",
           modifier = Modifier.size(150.dp * scale.value)
       )
    }
}







@Preview(showBackground = true)
@Composable
fun SplashScreenPre(){
    Surface (
        modifier = Modifier.fillMaxSize()
    ) {
      SplashScreenView(onSplashScreenFinished = {})
    }
}