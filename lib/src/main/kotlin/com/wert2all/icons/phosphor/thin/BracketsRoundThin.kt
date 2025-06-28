package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BracketsRoundThin: ImageVector
    get() {
        if (_BracketsRoundThin != null) {
            return _BracketsRoundThin!!
        }
        _BracketsRoundThin =
            ImageVector
                .Builder(
                    name = "BracketsRoundThin",
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
                        moveTo(72f, 40f)
                        reflectiveCurveTo(32f, 64f, 32f, 128f)
                        reflectiveCurveToRelative(40f, 88f, 40f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 40f)
                        reflectiveCurveToRelative(40f, 24f, 40f, 88f)
                        reflectiveCurveToRelative(-40f, 88f, -40f, 88f)
                    }
                }.build()

        return _BracketsRoundThin!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsRoundThin: ImageVector? = null
