package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.DiamondsFourLight: ImageVector
    get() {
        if (_DiamondsFourLight != null) {
            return _DiamondsFourLight!!
        }
        _DiamondsFourLight =
            ImageVector
                .Builder(
                    name = "Light.DiamondsFourLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 64f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 192f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152.01f, 128f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24.01f, 128f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                }.build()

        return _DiamondsFourLight!!
    }

@Suppress("ObjectPropertyName")
private var _DiamondsFourLight: ImageVector? = null
