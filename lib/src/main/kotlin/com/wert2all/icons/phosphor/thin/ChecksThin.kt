package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ChecksThin: ImageVector
    get() {
        if (_ChecksThin != null) {
            return _ChecksThin!!
        }
        _ChecksThin =
            ImageVector
                .Builder(
                    name = "ChecksThin",
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
                        moveTo(16f, 130.29f)
                        lineToRelative(38.4f, 37.71f)
                        lineToRelative(89.6f, -88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(125.96f, 144f)
                        lineToRelative(24.44f, 24f)
                        lineToRelative(89.6f, -88f)
                    }
                }.build()

        return _ChecksThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChecksThin: ImageVector? = null
