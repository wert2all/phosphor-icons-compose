package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.HouseDuotone: ImageVector
    get() {
        if (_HouseDuotone != null) {
            return _HouseDuotone!!
        }
        _HouseDuotone =
            ImageVector
                .Builder(
                    name = "HouseDuotone",
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
                        moveTo(104f, 216f)
                        verticalLineTo(152f)
                        horizontalLineToRelative(48f)
                        verticalLineToRelative(64f)
                        horizontalLineToRelative(64f)
                        verticalLineTo(120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                        lineToRelative(-80f, -80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                        lineToRelative(-80f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 120f)
                        verticalLineToRelative(96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 216f)
                        verticalLineTo(152f)
                        horizontalLineToRelative(48f)
                        verticalLineToRelative(64f)
                        horizontalLineToRelative(64f)
                        verticalLineTo(120f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.34f, -5.66f)
                        lineToRelative(-80f, -80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 0f)
                        lineToRelative(-80f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 120f)
                        verticalLineToRelative(96f)
                        close()
                    }
                }.build()

        return _HouseDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HouseDuotone: ImageVector? = null
