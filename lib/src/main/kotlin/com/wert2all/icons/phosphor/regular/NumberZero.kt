package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.NumberZero: ImageVector
    get() {
        if (_NumberZero != null) {
            return _NumberZero!!
        }
        _NumberZero =
            ImageVector
                .Builder(
                    name = "NumberZero",
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
                        moveTo(64f, 128f)
                        arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                        arcToRelative(64f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                        close()
                    }
                }.build()

        return _NumberZero!!
    }

@Suppress("ObjectPropertyName")
private var _NumberZero: ImageVector? = null
