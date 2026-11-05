package com.example.mvvm.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

enum class Navigasi {
    Formulir,
    Detail
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SiswaApp(
    //edit 1 : parameter viewModel
    modifier: Modifier = Modifier, // Menambahkan default value "= Modifier" agar lebih fleksibel
    viewModel: SiswaViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
)