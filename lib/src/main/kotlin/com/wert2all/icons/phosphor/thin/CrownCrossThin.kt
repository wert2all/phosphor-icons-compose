package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CrownCrossThin: ImageVector
    get() {
        if (_CrownCrossThin != null) {
            return _CrownCrossThin!!
        }
        _CrownCrossThin =
            ImageVector
                .Builder(
                    name = "CrownCrossThin",
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
                        moveTo(128f, 176f)
                        lineTo(128f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 32f)
                        lineTo(152f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 116f)
                        arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 64f)
                        curveToRelative(28.72f, 0f, 52f, 19.28f, 52f, 48f)
                        curveToRelative(0f, -28.72f, 23.28f, -48f, 52f, -48f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 52f, 52f)
                        curveToRelative(0f, 52f, -48f, 68f, -48f, 68f)
                        verticalLineToRelative(24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(184f)
                        reflectiveCurveTo(24f, 168f, 24f, 116f)
                        close()
                    }
                }.build()

        return _CrownCrossThin!!
    }

@Suppress("ObjectPropertyName")
private var _CrownCrossThin: ImageVector? = null
