package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.GearLight: ImageVector
    get() {
        if (_GearLight != null) {
            return _GearLight!!
        }
        _GearLight =
            ImageVector
                .Builder(
                    name = "GearLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(41.43f, 178.09f)
                        arcTo(99.14f, 99.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31.36f, 153.8f)
                        lineToRelative(16.78f, -21f)
                        arcToRelative(81.59f, 81.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -9.64f)
                        lineToRelative(-16.77f, -21f)
                        arcToRelative(99.43f, 99.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.05f, -24.3f)
                        lineToRelative(26.71f, -3f)
                        arcToRelative(81f, 81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.81f, -6.81f)
                        lineToRelative(3f, -26.7f)
                        arcTo(99.14f, 99.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102.2f, 31.36f)
                        lineToRelative(21f, 16.78f)
                        arcToRelative(81.59f, 81.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.64f, 0f)
                        lineToRelative(21f, -16.77f)
                        arcToRelative(99.43f, 99.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.3f, 10.05f)
                        lineToRelative(3f, 26.71f)
                        arcToRelative(81f, 81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.81f, 6.81f)
                        lineToRelative(26.7f, 3f)
                        arcToRelative(99.14f, 99.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.07f, 24.29f)
                        lineToRelative(-16.78f, 21f)
                        arcToRelative(81.59f, 81.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 9.64f)
                        lineToRelative(16.77f, 21f)
                        arcToRelative(99.43f, 99.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10f, 24.3f)
                        lineToRelative(-26.71f, 3f)
                        arcToRelative(81f, 81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.81f, 6.81f)
                        lineToRelative(-3f, 26.7f)
                        arcToRelative(99.14f, 99.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.29f, 10.07f)
                        lineToRelative(-21f, -16.78f)
                        arcToRelative(81.59f, 81.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.64f, 0f)
                        lineToRelative(-21f, 16.77f)
                        arcToRelative(99.43f, 99.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.3f, -10f)
                        lineToRelative(-3f, -26.71f)
                        arcToRelative(81f, 81f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.81f, -6.81f)
                        close()
                    }
                }.build()

        return _GearLight!!
    }

@Suppress("ObjectPropertyName")
private var _GearLight: ImageVector? = null
