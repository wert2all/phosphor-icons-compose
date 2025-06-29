package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ToggleRightBold: ImageVector
    get() {
        if (_ToggleRightBold != null) {
            return _ToggleRightBold!!
        }
        _ToggleRightBold =
            ImageVector
                .Builder(
                    name = "ToggleRightBold",
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
                        moveTo(80f, 64f)
                        lineTo(176f, 64f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                        lineTo(240f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 192f)
                        lineTo(80f, 192f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 128f)
                        lineTo(16f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 128f)
                        moveToRelative(-28f, 0f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, 0f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, 0f)
                    }
                }.build()

        return _ToggleRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleRightBold: ImageVector? = null
