package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CylinderThin: ImageVector
    get() {
        if (_CylinderThin != null) {
            return _CylinderThin!!
        }
        _CylinderThin =
            ImageVector
                .Builder(
                    name = "CylinderThin",
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
                        moveTo(64f, 60f)
                        arcToRelative(64f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                        arcToRelative(64f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 60f)
                        verticalLineTo(196f)
                        curveToRelative(0f, 19.88f, 28.65f, 36f, 64f, 36f)
                        reflectiveCurveToRelative(64f, -16.12f, 64f, -36f)
                        verticalLineTo(60f)
                    }
                }.build()

        return _CylinderThin!!
    }

@Suppress("ObjectPropertyName")
private var _CylinderThin: ImageVector? = null
