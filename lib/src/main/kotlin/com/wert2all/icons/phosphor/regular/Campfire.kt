package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Campfire: ImageVector
    get() {
        if (_Campfire != null) {
            return _Campfire!!
        }
        _Campfire =
            ImageVector
                .Builder(
                    name = "Regular.Campfire",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 168f)
                        lineTo(216f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 168f)
                        lineTo(40f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 136f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                        curveToRelative(0f, -24f, 24f, -40f, 24f, -40f)
                        reflectiveCurveTo(152f, 112f, 152f, 136f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(180f, 108f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -104f, 0f)
                        curveToRelative(0f, -44f, 52f, -76f, 52f, -76f)
                        reflectiveCurveTo(180f, 64f, 180f, 108f)
                        close()
                    }
                }.build()

        return _Campfire!!
    }

@Suppress("ObjectPropertyName")
private var _Campfire: ImageVector? = null
