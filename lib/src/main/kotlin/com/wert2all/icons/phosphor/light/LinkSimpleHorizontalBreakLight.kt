package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.LinkSimpleHorizontalBreakLight: ImageVector
    get() {
        if (_LinkSimpleHorizontalBreakLight != null) {
            return _LinkSimpleHorizontalBreakLight!!
        }
        _LinkSimpleHorizontalBreakLight =
            ImageVector
                .Builder(
                    name = "LinkSimpleHorizontalBreakLight",
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
                        moveTo(104f, 176f)
                        horizontalLineTo(64f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -96f)
                        horizontalLineToRelative(40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 80f)
                        horizontalLineToRelative(40f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                        horizontalLineToRelative(0f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
                        horizontalLineTo(152f)
                    }
                }.build()

        return _LinkSimpleHorizontalBreakLight!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimpleHorizontalBreakLight: ImageVector? = null
