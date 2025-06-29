package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.HandPointingDuotone: ImageVector
    get() {
        if (_HandPointingDuotone != null) {
            return _HandPointingDuotone!!
        }
        _HandPointingDuotone =
            ImageVector
                .Builder(
                    name = "HandPointingDuotone",
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
                        moveTo(196f, 96f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, 20f)
                        verticalLineTo(100f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                        verticalLineTo(44f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 0f)
                        verticalLineTo(152f)
                        lineTo(77.32f, 122f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34.64f, 20f)
                        curveToRelative(37.51f, 66f, 49.14f, 90f, 93.32f, 90f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, -80f)
                        verticalLineTo(116f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(42.68f, 142f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 34.64f, -20f)
                        lineTo(96f, 152f)
                        verticalLineTo(44f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(56f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(16f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 0f)
                        verticalLineToRelative(36f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, 80f)
                        curveTo(91.82f, 232f, 80.19f, 208f, 42.68f, 142f)
                        close()
                    }
                }.build()

        return _HandPointingDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HandPointingDuotone: ImageVector? = null
