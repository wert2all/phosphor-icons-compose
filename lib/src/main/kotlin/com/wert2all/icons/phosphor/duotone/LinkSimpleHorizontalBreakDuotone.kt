package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.LinkSimpleHorizontalBreakDuotone: ImageVector
    get() {
        if (_LinkSimpleHorizontalBreakDuotone != null) {
            return _LinkSimpleHorizontalBreakDuotone!!
        }
        _LinkSimpleHorizontalBreakDuotone =
            ImageVector
                .Builder(
                    name = "LinkSimpleHorizontalBreakDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(64f, 80f)
                        lineTo(192f, 80f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                        lineTo(240f, 128f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
                        lineTo(64f, 176f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 128f)
                        lineTo(16f, 128f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 80f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        strokeLineWidth = 16f,
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

        return _LinkSimpleHorizontalBreakDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimpleHorizontalBreakDuotone: ImageVector? = null
