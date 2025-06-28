package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.TargetThin: ImageVector
    get() {
        if (_TargetThin != null) {
            return _TargetThin!!
        }
        _TargetThin =
            ImageVector
                .Builder(
                    name = "TargetThin",
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
                        moveTo(128f, 128f)
                        lineTo(224f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(195.88f, 60.12f)
                        arcToRelative(95.88f, 95.88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.77f, 26.49f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(161.94f, 94.06f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 31.2f)
                    }
                }.build()

        return _TargetThin!!
    }

@Suppress("ObjectPropertyName")
private var _TargetThin: ImageVector? = null
