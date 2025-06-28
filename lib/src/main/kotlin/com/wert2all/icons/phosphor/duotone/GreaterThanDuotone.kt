package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.GreaterThanDuotone: ImageVector
    get() {
        if (_GreaterThanDuotone != null) {
            return _GreaterThanDuotone!!
        }
        _GreaterThanDuotone =
            ImageVector
                .Builder(
                    name = "GreaterThanDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(64f, 56f)
                        lineToRelative(152f, 72f)
                        lineToRelative(-152f, 72f)
                        lineToRelative(0f, -144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 56f)
                        lineToRelative(152f, 72f)
                        lineToRelative(-152f, 72f)
                    }
                }.build()

        return _GreaterThanDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanDuotone: ImageVector? = null
