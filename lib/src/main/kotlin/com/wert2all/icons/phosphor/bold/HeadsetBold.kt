package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.HeadsetBold: ImageVector
    get() {
        if (_HeadsetBold != null) {
            return _HeadsetBold!!
        }
        _HeadsetBold =
            ImageVector
                .Builder(
                    name = "Bold.HeadsetBold",
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
                        moveTo(224f, 200f)
                        verticalLineToRelative(8f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        horizontalLineTo(136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 128f)
                        horizontalLineTo(192f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                        verticalLineToRelative(40f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(32f)
                        verticalLineTo(128f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, -192f, 0f)
                        verticalLineToRelative(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineTo(64f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        verticalLineTo(144f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        horizontalLineTo(32f)
                    }
                }.build()

        return _HeadsetBold!!
    }

@Suppress("ObjectPropertyName")
private var _HeadsetBold: ImageVector? = null
