package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.BookLight: ImageVector
    get() {
        if (_BookLight != null) {
            return _BookLight!!
        }
        _BookLight =
            ImageVector
                .Builder(
                    name = "Light.BookLight",
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
                        moveTo(48f, 216f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                        horizontalLineTo(208f)
                        verticalLineTo(32f)
                        horizontalLineTo(72f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 216f)
                        lineToRelative(0f, 8f)
                        lineToRelative(144f, 0f)
                    }
                }.build()

        return _BookLight!!
    }

@Suppress("ObjectPropertyName")
private var _BookLight: ImageVector? = null
