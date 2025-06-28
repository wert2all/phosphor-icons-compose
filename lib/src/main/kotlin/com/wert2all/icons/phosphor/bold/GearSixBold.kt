package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.GearSixBold: ImageVector
    get() {
        if (_GearSixBold != null) {
            return _GearSixBold!!
        }
        _GearSixBold =
            ImageVector
                .Builder(
                    name = "GearSixBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(130.05f, 206.11f)
                        curveToRelative(-1.34f, 0f, -2.69f, 0f, -4f, 0f)
                        lineTo(94f, 224f)
                        arcToRelative(
                            104.61f,
                            104.61f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            -34.11f,
                            -19.2f,
                        )
                        lineToRelative(-0.12f, -36f)
                        curveToRelative(-0.71f, -1.12f, -1.38f, -2.25f, -2f, -3.41f)
                        lineTo(25.9f, 147.24f)
                        arcToRelative(99.15f, 99.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -38.46f)
                        lineToRelative(31.84f, -18.1f)
                        curveToRelative(0.65f, -1.15f, 1.32f, -2.29f, 2f, -3.41f)
                        lineToRelative(0.16f, -36f)
                        arcTo(104.58f, 104.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94f, 32f)
                        lineToRelative(32f, 17.89f)
                        curveToRelative(1.34f, 0f, 2.69f, 0f, 4f, 0f)
                        lineTo(162f, 32f)
                        arcToRelative(104.61f, 104.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.11f, 19.2f)
                        lineToRelative(0.12f, 36f)
                        curveToRelative(0.71f, 1.12f, 1.38f, 2.25f, 2f, 3.41f)
                        lineToRelative(31.85f, 18.14f)
                        arcToRelative(99.15f, 99.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 38.46f)
                        lineToRelative(-31.84f, 18.1f)
                        curveToRelative(-0.65f, 1.15f, -1.32f, 2.29f, -2f, 3.41f)
                        lineToRelative(-0.16f, 36f)
                        arcTo(104.58f, 104.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 162f, 224f)
                        close()
                    }
                }.build()

        return _GearSixBold!!
    }

@Suppress("ObjectPropertyName")
private var _GearSixBold: ImageVector? = null
