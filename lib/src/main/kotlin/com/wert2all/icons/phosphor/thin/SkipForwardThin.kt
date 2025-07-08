package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.SkipForwardThin: ImageVector
    get() {
        if (_SkipForwardThin != null) {
            return _SkipForwardThin!!
        }
        _SkipForwardThin =
            ImageVector
                .Builder(
                    name = "Thin.SkipForwardThin",
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
                        moveTo(200f, 40f)
                        lineTo(200f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 47.88f)
                        verticalLineTo(208.12f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.19f, 6.65f)
                        lineTo(196.3f, 134.65f)
                        arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.3f)
                        lineTo(68.19f, 41.23f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 47.88f)
                        close()
                    }
                }.build()

        return _SkipForwardThin!!
    }

@Suppress("ObjectPropertyName")
private var _SkipForwardThin: ImageVector? = null
