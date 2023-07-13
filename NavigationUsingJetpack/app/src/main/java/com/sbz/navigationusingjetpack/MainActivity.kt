package com.sbz.navigationusingjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.sbz.navigationusingjetpack.ui.theme.NavigationUsingJetpackTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationUsingJetpackTheme {
                navHostController = rememberNavController()
                SetUpNavGraph(navHostController = navHostController)
            }
        }
    }
}
