package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.CaretDoubleRightThin: ImageVector
    get() {
        if (_CaretDoubleRightThin != null) {
            return _CaretDoubleRightThin!!
        }
        _CaretDoubleRightThin =
            ImageVector
                .Builder(
                    name = "Thin.CaretDoubleRightThin",
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
                        moveTo(56f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 48f)
                        lineToRelative(80f, 80f)
                        lineToRelative(-80f, 80f)
                    }
                }.build()

        return _CaretDoubleRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _CaretDoubleRightThin: ImageVector? = null
