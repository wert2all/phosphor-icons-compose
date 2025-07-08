package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.SpadeThin: ImageVector
    get() {
        if (_SpadeThin != null) {
            return _SpadeThin!!
        }
        _SpadeThin =
            ImageVector
                .Builder(
                    name = "Thin.SpadeThin",
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
                        moveTo(128f, 24f)
                        reflectiveCurveTo(32f, 72f, 32f, 136f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.55f, 36.18f)
                        lineTo(96f, 224f)
                        horizontalLineToRelative(64f)
                        lineToRelative(-15.55f, -51.82f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 136f)
                        curveTo(224f, 72f, 128f, 24f, 128f, 24f)
                        close()
                    }
                }.build()

        return _SpadeThin!!
    }

@Suppress("ObjectPropertyName")
private var _SpadeThin: ImageVector? = null
