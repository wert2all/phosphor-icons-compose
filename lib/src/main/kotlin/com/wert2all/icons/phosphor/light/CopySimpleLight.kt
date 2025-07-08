package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.CopySimpleLight: ImageVector
    get() {
        if (_CopySimpleLight != null) {
            return _CopySimpleLight!!
        }
        _CopySimpleLight =
            ImageVector
                .Builder(
                    name = "Light.CopySimpleLight",
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
                        moveTo(40f, 72f)
                        horizontalLineToRelative(144f)
                        verticalLineToRelative(144f)
                        horizontalLineToRelative(-144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 40f)
                        lineToRelative(144f, 0f)
                        lineToRelative(0f, 144f)
                    }
                }.build()

        return _CopySimpleLight!!
    }

@Suppress("ObjectPropertyName")
private var _CopySimpleLight: ImageVector? = null
