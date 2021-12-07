package com.lucascabral.todocomposeapp.ui.screens.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.lucascabral.todocomposeapp.R
import com.lucascabral.todocomposeapp.ui.theme.MediumGray

@Composable
fun EmptyContent() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*Icon(
            modifier = Modifier.size(120.dp),
            painter = painterResource(id = R.drawable.ic_sad_face),
            contentDescription = stringResource(id = R.string.sad_face_icon),
            tint = MediumGray
        ) */
        EmptyTasksLottieAnimation()
        Text(
            text = stringResource(id = R.string.empty_content),
            color = MediumGray,
            fontWeight = FontWeight.Bold,
            fontSize = MaterialTheme.typography.h6.fontSize
        )
    }
}

@Composable
fun EmptyTasksLottieAnimation() {
    val anim = rememberLottieAnimatable()
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.add_task))
    LaunchedEffect(composition) {
        anim.animate(
            composition,
            iterations = LottieConstants.IterateForever,
        )
    }
    LottieAnimation(anim.composition, anim.progress)
}

@Composable
@Preview
private fun EmptyContentPreview() {
    EmptyContent()
}