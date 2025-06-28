package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.DivideThin: ImageVector
    get() {
        if (_DivideThin != null) {
            return _DivideThin!!
        }
        _DivideThin =
            ImageVector
                .Builder(
                    name = "DivideThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 64f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 192f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _DivideThin!!
    }

@Suppress("ObjectPropertyName")
private var _DivideThin: ImageVector? = null
