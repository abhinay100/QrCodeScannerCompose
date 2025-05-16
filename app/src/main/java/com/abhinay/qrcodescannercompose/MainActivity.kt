package com.abhinay.qrcodescannercompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.abhinay.qrcodescannercompose.ui.theme.QrCodeScannerComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QrCodeScannerComposeTheme {
                
            }
        }
    }
}