package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.CaretLineUpThin: ImageVector
    get() {
        if (_CaretLineUpThin != null) {
            return _CaretLineUpThin!!
        }
        _CaretLineUpThin =
            ImageVector
                .Builder(
                    name = "Thin.CaretLineUpThin",
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
                        moveTo(48f, 192f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 72f)
                        lineTo(208f, 72f)
                    }
                }.build()

        return _CaretLineUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretLineUpThin: ImageVector? = null
