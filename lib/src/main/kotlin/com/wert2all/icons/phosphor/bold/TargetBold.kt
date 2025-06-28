package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.TargetBold: ImageVector
    get() {
        if (_TargetBold != null) {
            return _TargetBold!!
        }
        _TargetBold =
            ImageVector
                .Builder(
                    name = "TargetBold",
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
                        lineTo(224f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(195.88f, 60.12f)
                        arcTo(95.92f, 95.92f, 0f, isMoreThanHalf = true, isPositiveArc = false, 218f, 94.56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(161.94f, 94.06f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13.11f, 43.46f)
                    }
                }.build()

        return _TargetBold!!
    }

@Suppress("ObjectPropertyName")
private var _TargetBold: ImageVector? = null
