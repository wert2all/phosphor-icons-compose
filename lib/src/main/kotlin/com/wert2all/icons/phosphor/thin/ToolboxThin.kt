package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ToolboxThin: ImageVector
    get() {
        if (_ToolboxThin != null) {
            return _ToolboxThin!!
        }
        _ToolboxThin =
            ImageVector
                .Builder(
                    name = "Thin.ToolboxThin",
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
                        moveTo(32f, 72f)
                        lineTo(224f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 80f)
                        lineTo(232f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 200f)
                        lineTo(32f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 192f)
                        lineTo(24f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 120f)
                        lineTo(232f, 120f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 104f)
                        lineTo(72f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 104f)
                        lineTo(184f, 136f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 72f)
                        verticalLineTo(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                        horizontalLineTo(104f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 56f)
                        verticalLineTo(72f)
                    }
                }.build()

        return _ToolboxThin!!
    }

@Suppress("ObjectPropertyName")
private var _ToolboxThin: ImageVector? = null
