package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.EyeThin: ImageVector
    get() {
        if (_EyeThin != null) {
            return _EyeThin!!
        }
        _EyeThin =
            ImageVector
                .Builder(
                    name = "EyeThin",
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
                        moveTo(128f, 56f)
                        curveTo(48f, 56f, 16f, 128f, 16f, 128f)
                        reflectiveCurveToRelative(32f, 72f, 112f, 72f)
                        reflectiveCurveToRelative(112f, -72f, 112f, -72f)
                        reflectiveCurveTo(208f, 56f, 128f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
                }.build()

        return _EyeThin!!
    }

@Suppress("ObjectPropertyName")
private var _EyeThin: ImageVector? = null
