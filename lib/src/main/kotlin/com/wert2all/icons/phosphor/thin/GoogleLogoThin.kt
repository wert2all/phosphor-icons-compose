package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.GoogleLogoThin: ImageVector
    get() {
        if (_GoogleLogoThin != null) {
            return _GoogleLogoThin!!
        }
        _GoogleLogoThin =
            ImageVector
                .Builder(
                    name = "Thin.GoogleLogoThin",
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
                        moveTo(128f, 128f)
                        horizontalLineToRelative(88f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20.11f, -56f)
                    }
                }.build()

        return _GoogleLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleLogoThin: ImageVector? = null
