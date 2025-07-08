package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.LogDuotone: ImageVector
    get() {
        if (_LogDuotone != null) {
            return _LogDuotone!!
        }
        _LogDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.LogDuotone",
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
                        moveTo(160f, 136f)
                        arcToRelative(40f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 0f)
                        arcToRelative(40f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80f, 0f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 136f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 136f)
                        arcToRelative(40f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 0f)
                        arcToRelative(40f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 72f)
                        lineToRelative(40f, -40f)
                        lineToRelative(32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        horizontalLineTo(56f)
                        curveToRelative(-22.09f, 0f, -40f, -28.65f, -40f, -64f)
                        reflectiveCurveTo(33.91f, 72f, 56f, 72f)
                        horizontalLineTo(200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(17.26f, 120f)
                        lineTo(104f, 120f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 160f)
                        lineTo(162.91f, 160f)
                    }
                }.build()

        return _LogDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LogDuotone: ImageVector? = null
