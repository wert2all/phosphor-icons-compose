package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.HeartHalfDuotone: ImageVector
    get() {
        if (_HeartHalfDuotone != null) {
            return _HeartHalfDuotone!!
        }
        _HeartHalfDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.HeartHalfDuotone",
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
                        moveTo(128f, 224f)
                        reflectiveCurveTo(24f, 168f, 24f, 102f)
                        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                        curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 224f)
                        reflectiveCurveTo(24f, 168f, 24f, 102f)
                        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                        curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                        curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                        arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                        curveTo(232f, 168f, 128f, 224f, 128f, 224f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 80f)
                        lineTo(128f, 224f)
                    }
                }.build()

        return _HeartHalfDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHalfDuotone: ImageVector? = null
