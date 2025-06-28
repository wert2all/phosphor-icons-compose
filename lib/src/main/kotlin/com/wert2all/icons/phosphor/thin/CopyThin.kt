package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CopyThin: ImageVector
    get() {
        if (_CopyThin != null) {
            return _CopyThin!!
        }
        _CopyThin =
            ImageVector
                .Builder(
                    name = "CopyThin",
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
                        moveTo(168f, 168f)
                        lineToRelative(48f, 0f)
                        lineToRelative(0f, -128f)
                        lineToRelative(-128f, 0f)
                        lineToRelative(0f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _CopyThin!!
    }

@Suppress("ObjectPropertyName")
private var _CopyThin: ImageVector? = null
