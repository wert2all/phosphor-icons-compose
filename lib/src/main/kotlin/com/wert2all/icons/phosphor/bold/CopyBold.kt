package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.CopyBold: ImageVector
    get() {
        if (_CopyBold != null) {
            return _CopyBold!!
        }
        _CopyBold =
            ImageVector
                .Builder(
                    name = "CopyBold",
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
                        moveTo(168f, 168f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, -128f)
                        lineToRelative(-128f, 0f)
                        lineToRelative(0f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 88f)
                        horizontalLineToRelative(128f)
                        verticalLineToRelative(128f)
                        horizontalLineToRelative(-128f)
                        close()
                    }
                }.build()

        return _CopyBold!!
    }

@Suppress("ObjectPropertyName")
private var _CopyBold: ImageVector? = null
