package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BaseballCapThin: ImageVector
    get() {
        if (_BaseballCapThin != null) {
            return _BaseballCapThin!!
        }
        _BaseballCapThin =
            ImageVector
                .Builder(
                    name = "BaseballCapThin",
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
                        moveTo(32f, 128f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 0f)
                        verticalLineToRelative(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.48f, 12.88f)
                        curveTo(182.53f, 185.26f, 159f, 176f, 128f, 176f)
                        reflectiveCurveToRelative(-54.53f, 9.26f, -70.52f, 20.88f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 184f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 152f)
                        arcToRelative(160f, 160f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.4f, 124.94f)
                        curveTo(92.57f, 67.43f, 128f, 32f, 128f, 32f)
                        reflectiveCurveToRelative(35.43f, 35.43f, 39.6f, 92.94f)
                    }
                }.build()

        return _BaseballCapThin!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballCapThin: ImageVector? = null
