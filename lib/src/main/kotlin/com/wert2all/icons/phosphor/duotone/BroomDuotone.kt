package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.BroomDuotone: ImageVector
    get() {
        if (_BroomDuotone != null) {
            return _BroomDuotone!!
        }
        _BroomDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.BroomDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(43.93f, 105.57f)
                        arcTo(110.88f, 110.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.47f, 82.38f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.67f, -1.81f)
                        lineTo(95.52f, 90.85f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.82f, -9f)
                        lineToRelative(21f, -53.1f)
                        curveToRelative(4.15f, -10f, 15.47f, -15.33f, 25.63f, -11.53f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.51f, 26.39f)
                        lineTo(153.13f, 96.71f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.93f, 20.75f)
                        lineTo(187f, 127.3f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7.43f)
                        verticalLineTo(152f)
                        arcToRelative(104.58f, 104.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 13.12f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 224f)
                        arcToRelative(95.2f, 95.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -29f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 152f)
                        curveToRelative(0f, 31.67f, 13.31f, 59f, 40f, 72f)
                        horizontalLineTo(61f)
                        arcTo(103.65f, 103.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 152f)
                        curveToRelative(0f, -28.21f, 11.23f, -50.89f, 29.47f, -69.64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.67f, -1.81f)
                        lineTo(95.52f, 90.83f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.82f, -9f)
                        lineToRelative(21f, -53.11f)
                        curveToRelative(4.15f, -10f, 15.47f, -15.32f, 25.63f, -11.53f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.51f, 26.4f)
                        lineTo(153.13f, 96.69f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.93f, 20.76f)
                        lineTo(187f, 127.29f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 7.43f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(43.93f, 105.57f)
                        lineTo(192.8f, 165.12f)
                    }
                }.build()

        return _BroomDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BroomDuotone: ImageVector? = null
