package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.PushPinFill: ImageVector
    get() {
        if (_PushPinFill != null) {
            return _PushPinFill!!
        }
        _PushPinFill =
            ImageVector
                .Builder(
                    name = "PushPinFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(235.33f, 104f)
                        lineToRelative(-53.47f, 53.65f)
                        curveToRelative(4.56f, 12.67f, 6.45f, 33.89f, -13.19f, 60f)
                        arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 157f, 224f)
                        curveToRelative(-0.38f, 0f, -0.75f, 0f, -1.13f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -4.69f)
                        lineTo(96.29f, 171f)
                        lineTo(53.66f, 213.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                        lineTo(85f, 159.71f)
                        lineToRelative(-48.3f, -48.3f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38f, 87.63f)
                        curveToRelative(25.42f, -20.51f, 49.75f, -16.48f, 60.4f, -13.14f)
                        lineTo(152f, 20.7f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, 0f)
                        lineToRelative(60.69f, 60.68f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 235.33f, 104f)
                        close()
                    }
                }.build()

        return _PushPinFill!!
    }

@Suppress("ObjectPropertyName")
private var _PushPinFill: ImageVector? = null
