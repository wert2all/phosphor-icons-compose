package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.GoogleLogo: ImageVector
    get() {
        if (_GoogleLogo != null) {
            return _GoogleLogo!!
        }
        _GoogleLogo =
            ImageVector
                .Builder(
                    name = "GoogleLogo",
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
                        moveTo(128f, 128f)
                        horizontalLineToRelative(88f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20.11f, -56f)
                    }
                }.build()

        return _GoogleLogo!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleLogo: ImageVector? = null
