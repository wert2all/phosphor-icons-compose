package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.LinkSimpleHorizontalBreakThin: ImageVector
    get() {
        if (_LinkSimpleHorizontalBreakThin != null) {
            return _LinkSimpleHorizontalBreakThin!!
        }
        _LinkSimpleHorizontalBreakThin =
            ImageVector
                .Builder(
                    name = "Thin.LinkSimpleHorizontalBreakThin",
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
                        moveTo(104f, 176f)
                        horizontalLineTo(64f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -96f)
                        horizontalLineToRelative(40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _LinkSimpleHorizontalBreakThin!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimpleHorizontalBreakThin: ImageVector? = null
