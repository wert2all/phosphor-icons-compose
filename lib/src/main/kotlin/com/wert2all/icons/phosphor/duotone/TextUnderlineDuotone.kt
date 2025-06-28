package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.TextUnderlineDuotone: ImageVector
    get() {
        if (_TextUnderlineDuotone != null) {
            return _TextUnderlineDuotone!!
        }
        _TextUnderlineDuotone =
            ImageVector
                .Builder(
                    name = "TextUnderlineDuotone",
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
                        moveTo(184f, 56f)
                        verticalLineToRelative(80f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112f, 0f)
                        verticalLineTo(56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 224f)
                        lineTo(192f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 56f)
                        verticalLineToRelative(80f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -112f, 0f)
                        verticalLineTo(56f)
                    }
                }.build()

        return _TextUnderlineDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TextUnderlineDuotone: ImageVector? = null
