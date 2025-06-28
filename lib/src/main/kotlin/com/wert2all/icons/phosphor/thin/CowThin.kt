package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CowThin: ImageVector
    get() {
        if (_CowThin != null) {
            return _CowThin!!
        }
        _CowThin =
            ImageVector
                .Builder(
                    name = "CowThin",
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
                        moveTo(56f, 24f)
                        horizontalLineToRelative(0f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                        horizontalLineToRelative(48f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
                        horizontalLineToRelative(0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 160f)
                        lineTo(176f, 160f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 192f)
                        lineTo(208f, 192f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 224f)
                        lineTo(80f, 224f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 192f)
                        lineTo(48f, 192f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 160f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 192f)
                        lineTo(96f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 192f)
                        lineTo(176f, 192f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(100f, 124f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(156f, 124f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 72f)
                        horizontalLineToRelative(32.78f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.07f, 38.53f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 120f)
                        horizontalLineTo(192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 72f)
                        horizontalLineTo(63.22f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -47.07f, 38.53f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 120f)
                        horizontalLineTo(64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 164.28f)
                        verticalLineTo(104f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 72f)
                        horizontalLineToRelative(64f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                        verticalLineToRelative(60.28f)
                    }
                }.build()

        return _CowThin!!
    }

@Suppress("ObjectPropertyName")
private var _CowThin: ImageVector? = null
