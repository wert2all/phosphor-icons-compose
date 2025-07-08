package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.NumberFourThin: ImageVector
    get() {
        if (_NumberFourThin != null) {
            return _NumberFourThin!!
        }
        _NumberFourThin =
            ImageVector
                .Builder(
                    name = "Thin.NumberFourThin",
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
                        moveTo(184f, 168f)
                        lineToRelative(-120f, 0f)
                        lineToRelative(96f, -120f)
                        lineToRelative(0f, 160f)
                    }
                }.build()

        return _NumberFourThin!!
    }

@Suppress("ObjectPropertyName")
private var _NumberFourThin: ImageVector? = null
