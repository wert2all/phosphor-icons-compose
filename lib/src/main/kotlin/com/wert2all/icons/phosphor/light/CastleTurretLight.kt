package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CastleTurretLight: ImageVector
    get() {
        if (_CastleTurretLight != null) {
            return _CastleTurretLight!!
        }
        _CastleTurretLight =
            ImageVector
                .Builder(
                    name = "Light.CastleTurretLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 224f)
                        verticalLineTo(112f)
                        lineToRelative(13.66f, -13.66f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 92.69f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
                        horizontalLineTo(176f)
                        verticalLineTo(72f)
                        horizontalLineTo(144f)
                        verticalLineTo(40f)
                        horizontalLineTo(112f)
                        verticalLineTo(72f)
                        horizontalLineTo(80f)
                        verticalLineTo(40f)
                        horizontalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(92.69f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.34f, 5.65f)
                        lineTo(64f, 112f)
                        verticalLineTo(224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 224f)
                        verticalLineTo(168f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                        verticalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 224f)
                        lineTo(216f, 224f)
                    }
                }.build()

        return _CastleTurretLight!!
    }

@Suppress("ObjectPropertyName")
private var _CastleTurretLight: ImageVector? = null
