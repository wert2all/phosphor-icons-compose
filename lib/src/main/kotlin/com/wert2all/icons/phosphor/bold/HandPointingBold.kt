package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.HandPointingBold: ImageVector
    get() {
        if (_HandPointingBold != null) {
            return _HandPointingBold!!
        }
        _HandPointingBold =
            ImageVector
                .Builder(
                    name = "HandPointingBold",
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
                        moveTo(42.68f, 142f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                        lineTo(96f, 152f)
                        verticalLineTo(44f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(56f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(16f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(36f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                        curveTo(91.82f, 232f, 80.19f, 208f, 42.68f, 142f)
                        close()
                    }
                }.build()

        return _HandPointingBold!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingBold: ImageVector? = null
