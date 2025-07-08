package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowDownRightThin: ImageVector
    get() {
        if (_ArrowDownRightThin != null) {
            return _ArrowDownRightThin!!
        }
        _ArrowDownRightThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowDownRightThin",
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
                        moveTo(64f, 64f)
                        lineTo(192f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 192f)
                        lineToRelative(104f, 0f)
                        lineToRelative(0f, -104f)
                    }
                }.build()

        return _ArrowDownRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightThin: ImageVector? = null
