package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.EggThin: ImageVector
    get() {
        if (_EggThin != null) {
            return _EggThin!!
        }
        _EggThin =
            ImageVector
                .Builder(
                    name = "EggThin",
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
                        moveTo(208f, 152f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                        curveTo(48f, 88f, 96f, 24f, 128f, 24f)
                        reflectiveCurveTo(208f, 88f, 208f, 152f)
                        close()
                    }
                }.build()

        return _EggThin!!
    }

@Suppress("ObjectPropertyName")
private var _EggThin: ImageVector? = null
