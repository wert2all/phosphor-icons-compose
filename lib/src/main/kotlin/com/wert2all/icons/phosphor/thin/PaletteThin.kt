package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.PaletteThin: ImageVector
    get() {
        if (_PaletteThin != null) {
            return _PaletteThin!!
        }
        _PaletteThin =
            ImageVector
                .Builder(
                    name = "PaletteThin",
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
                        moveTo(128f, 192f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                        horizontalLineToRelative(46.21f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.4f, -18.65f)
                        arcTo(96.48f, 96.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 127.17f)
                        curveToRelative(-0.45f, -52.82f, -44.16f, -95.7f, -97f, -95.17f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -95f, 96f)
                        curveToRelative(0f, 41.81f, 26.73f, 73.44f, 64f, 86.61f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 192f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 76f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(84f, 100f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(84f, 156f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(172f, 100f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                }.build()

        return _PaletteThin!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteThin: ImageVector? = null
