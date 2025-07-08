package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.LinkSimple: ImageVector
    get() {
        if (_LinkSimple != null) {
            return _LinkSimple!!
        }
        _LinkSimple =
            ImageVector
                .Builder(
                    name = "Regular.LinkSimple",
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
                        moveTo(96f, 160f)
                        lineTo(160f, 96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 76.11f)
                        lineToRelative(30.06f, -30f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.88f, 67.88f)
                        lineTo(179.88f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(76.11f, 112f)
                        lineToRelative(-30f, 30.06f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.88f, 67.88f)
                        lineTo(144f, 179.88f)
                    }
                }.build()

        return _LinkSimple!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimple: ImageVector? = null
