package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CopySimpleBold: ImageVector
    get() {
        if (_CopySimpleBold != null) {
            return _CopySimpleBold!!
        }
        _CopySimpleBold =
            ImageVector
                .Builder(
                    name = "CopySimpleBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 76f)
                        horizontalLineToRelative(140f)
                        verticalLineToRelative(140f)
                        horizontalLineToRelative(-140f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(76f, 40f)
                        lineToRelative(140f, 0f)
                        lineToRelative(0f, 140f)
                    }
                }.build()

        return _CopySimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _CopySimpleBold: ImageVector? = null
