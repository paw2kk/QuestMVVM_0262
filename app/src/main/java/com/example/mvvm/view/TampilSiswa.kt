package com.example.mvvm.view


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mvvm.R
import com.example.mvvm.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    //edit 1 : parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {
    //edit 2 : items Pair
    val items = listOf(
        Pair(stringResource(R.string.nama), statusUiSiswa.nama),
        Pair(stringResource(id = R.string.gender), statusUiSiswa.gender),
        Pair(stringResource(R.string.alamat), statusUiSiswa.alamat)
    )

    Scaffold(
        modifier = Modifier,
        // Gunakan parameter topBar secara eksplisit
        topBar = {
            TopAppBar(
                title = { Text(stringResource(id = R.string.detail), color = Color.White) },
                // Gunakan topAppBarColors dan containerColor yang terbaru dari Material 3
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                ),
            )
        }
    )
