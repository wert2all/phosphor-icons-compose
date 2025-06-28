package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.NumberSevenThin: ImageVector
    get() {
        if (_NumberSevenThin != null) {
            return _NumberSevenThin!!
        }
        _NumberSevenThin =
            ImageVector
                .Builder(
                    name = "NumberSevenThin",
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
                        moveTo(88f, 48f)
                        lineToRelative(80f, 0f)
                        lineToRelative(-48f, 160f)
                    }
                }.build()

        return _NumberSevenThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSevenThin: ImageVector? = null
