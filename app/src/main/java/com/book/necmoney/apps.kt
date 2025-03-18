package com.book.necmoney

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.book.necmoney.ui.theme.NecMoneyTheme

@Composable
fun MyApp(){
    NecMoneyTheme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background,
        ){
            Text(
                style = MaterialTheme.typography.titleLarge,
                text = "Jarful islam",
                )
        }
    }
}