package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Club: ImageVector
    get() {
        if (_Club != null) {
            return _Club!!
        }
        _Club =
            ImageVector
                .Builder(
                    name = "Club",
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
                        moveTo(167.83f, 98.79f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -23.9f, 71.65f)
                        lineTo(160f, 224f)
                        horizontalLineTo(96f)
                        lineToRelative(16.07f, -53.56f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -23.9f, -71.65f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 79.66f, 0f)
                        close()
                    }
                }.build()

        return _Club!!
    }

@Suppress("ObjectPropertyName")
private var _Club: ImageVector? = null
