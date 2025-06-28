package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BracketsAngleThin: ImageVector
    get() {
        if (_BracketsAngleThin != null) {
            return _BracketsAngleThin!!
        }
        _BracketsAngleThin =
            ImageVector
                .Builder(
                    name = "BracketsAngleThin",
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
                        moveTo(80f, 40f)
                        lineToRelative(-56f, 88f)
                        lineToRelative(56f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineToRelative(56f, 88f)
                        lineToRelative(-56f, 88f)
                    }
                }.build()

        return _BracketsAngleThin!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsAngleThin: ImageVector? = null
