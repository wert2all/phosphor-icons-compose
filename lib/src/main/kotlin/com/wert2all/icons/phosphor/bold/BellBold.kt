package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.BellBold: ImageVector
    get() {
        if (_BellBold != null) {
            return _BellBold!!
        }
        _BellBold =
            ImageVector
                .Builder(
                    name = "BellBold",
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
                        moveTo(96f, 184f)
                        verticalLineToRelative(8f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                        verticalLineToRelative(-8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 104f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                        curveToRelative(0f, 35.82f, 8.3f, 56.6f, 14.9f, 68f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 184f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.88f, -12f)
                        curveTo(47.71f, 160.6f, 56f, 139.81f, 56f, 104f)
                        close()
                    }
                }.build()

        return _BellBold!!
    }

@Suppress("ObjectPropertyName")
private var _BellBold: ImageVector? = null
