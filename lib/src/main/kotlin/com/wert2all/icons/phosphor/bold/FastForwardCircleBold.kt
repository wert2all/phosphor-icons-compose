package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.FastForwardCircleBold: ImageVector
    get() {
        if (_FastForwardCircleBold != null) {
            return _FastForwardCircleBold!!
        }
        _FastForwardCircleBold =
            ImageVector
                .Builder(
                    name = "FastForwardCircleBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(191.5f, 118.63f)
                        lineToRelative(-40f, -32f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 132f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 9.37f)
                        lineToRelative(40f, -32f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -18.74f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(135.5f, 118.63f)
                        lineToRelative(-40f, -32f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 76f, 96f)
                        verticalLineToRelative(64f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 9.37f)
                        lineToRelative(40f, -32f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -18.74f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-96f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
                    }
                }.build()

        return _FastForwardCircleBold!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardCircleBold: ImageVector? = null
