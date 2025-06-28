package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.OnigiriThin: ImageVector
    get() {
        if (_OnigiriThin != null) {
            return _OnigiriThin!!
        }
        _OnigiriThin =
            ImageVector
                .Builder(
                    name = "OnigiriThin",
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
                        moveTo(88f, 224f)
                        verticalLineTo(168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(31.29f, 150.69f)
                        curveTo(11.45f, 182.66f, 34.44f, 224f, 72.08f, 224f)
                        horizontalLineTo(183.92f)
                        curveToRelative(37.64f, 0f, 60.63f, -41.34f, 40.79f, -73.31f)
                        lineToRelative(-55.93f, -96f)
                        curveTo(150f, 24.44f, 106f, 24.44f, 87.22f, 54.69f)
                        close()
                    }
                }.build()

        return _OnigiriThin!!
    }

@Suppress("ObjectPropertyName")
private var _OnigiriThin: ImageVector? = null
