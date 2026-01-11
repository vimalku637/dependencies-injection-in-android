
package com.example.dependencyinjectionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.dependencyinjectionandroid.ui.screen.UserListScreen
import com.example.dependencyinjectionandroid.ui.theme.DependencyInjectionAndroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DependencyInjectionAndroidTheme {
                UserListScreen()
            }
        }
    }
}