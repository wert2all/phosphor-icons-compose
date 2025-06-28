package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BracketsSquareThin: ImageVector
    get() {
        if (_BracketsSquareThin != null) {
            return _BracketsSquareThin!!
        }
        _BracketsSquareThin =
            ImageVector
                .Builder(
                    name = "BracketsSquareThin",
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
                        lineToRelative(-40f, 0f)
                        lineToRelative(0f, 176f)
                        lineToRelative(40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineToRelative(40f, 0f)
                        lineToRelative(0f, 176f)
                        lineToRelative(-40f, 0f)
                    }
                }.build()

        return _BracketsSquareThin!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsSquareThin: ImageVector? = null
