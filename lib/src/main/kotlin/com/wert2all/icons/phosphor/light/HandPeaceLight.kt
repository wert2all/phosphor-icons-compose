package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.HandPeaceLight: ImageVector
    get() {
        if (_HandPeaceLight != null) {
            return _HandPeaceLight!!
        }
        _HandPeaceLight =
            ImageVector
                .Builder(
                    name = "Light.HandPeaceLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 131.6f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                        lineToRelative(20.81f, 4f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 39.19f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 152.72f)
                        verticalLineTo(160f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.55f, 72f)
                        curveToRelative(39.7f, -0.3f, 71.45f, -33.2f, 71.45f, -72.9f)
                        verticalLineToRelative(-3.34f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.59f, -47.07f)
                        lineTo(140f, 104.41f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 39.19f)
                        lineToRelative(15.37f, 3.07f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 179.6f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 172.32f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                        lineToRelative(10f, 2f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 39.2f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(101.37f, 96.53f)
                        lineTo(88.69f, 49.18f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 38.63f, -10.35f)
                        lineToRelative(17.85f, 66.61f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(150.54f, 106.51f)
                        lineToRelative(18.14f, -67.68f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.63f, 10.35f)
                        lineToRelative(-19.88f, 74.19f)
                    }
                }.build()

        return _HandPeaceLight!!
    }

@Suppress("ObjectPropertyName")
private var _HandPeaceLight: ImageVector? = null
