package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ParagraphDuotone: ImageVector
    get() {
        if (_ParagraphDuotone != null) {
            return _ParagraphDuotone!!
        }
        _ParagraphDuotone =
            ImageVector
                .Builder(
                    name = "ParagraphDuotone",
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
                        moveTo(144f, 160f)
                        horizontalLineTo(96f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
                        horizontalLineToRelative(48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 48f)
                        lineTo(184f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 48f)
                        lineTo(144f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 160f)
                        horizontalLineTo(96f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 48f)
                        horizontalLineTo(208f)
                    }
                }.build()

        return _ParagraphDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ParagraphDuotone: ImageVector? = null
