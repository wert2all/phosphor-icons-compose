package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.ArrowsLeftRightBold: ImageVector
    get() {
        if (_ArrowsLeftRightBold != null) {
            return _ArrowsLeftRightBold!!
        }
        _ArrowsLeftRightBold =
            ImageVector
                .Builder(
                    name = "Bold.ArrowsLeftRightBold",
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
                        moveTo(176f, 144f)
                        lineToRelative(32f, 32f)
                        lineToRelative(-32f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 176f)
                        lineTo(208f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 112f)
                        lineToRelative(-32f, -32f)
                        lineToRelative(32f, -32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 80f)
                        lineTo(48f, 80f)
                    }
                }.build()

        return _ArrowsLeftRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowsLeftRightBold: ImageVector? = null
