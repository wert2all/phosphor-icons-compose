package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.HandWavingThin: ImageVector
    get() {
        if (_HandWavingThin != null) {
            return _HandWavingThin!!
        }
        _HandWavingThin =
            ImageVector
                .Builder(
                    name = "Thin.HandWavingThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96.65f, 62f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                        lineToRelative(30f, 52f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(69.32f, 94.67f)
                        lineTo(55.08f, 70f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.73f, 50f)
                        lineToRelative(31.17f, 54f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(158.87f, 160f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 105.58f)
                        lineTo(161.32f, 94f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 196f, 74f)
                        lineToRelative(17.31f, 30f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 74.7f, 184f)
                        lineToRelative(-40f, -69.32f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                        lineTo(88.57f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 33.78f)
                        arcTo(51.84f, 51.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.67f, 58f)
                        lineToRelative(0.33f, 0.57f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(74.62f, 232f)
                        arcTo(111.88f, 111.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47f, 200f)
                    }
                }.build()

        return _HandWavingThin!!
    }

@Suppress("ObjectPropertyName")
private var _HandWavingThin: ImageVector? = null
