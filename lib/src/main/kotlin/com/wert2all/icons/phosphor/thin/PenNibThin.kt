package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.PenNibThin: ImageVector
    get() {
        if (_PenNibThin != null) {
            return _PenNibThin!!
        }
        _PenNibThin =
            ImageVector
                .Builder(
                    name = "PenNibThin",
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
                        moveTo(40f, 216f)
                        lineToRelative(139.45f, -23.24f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.17f, -5.08f)
                        lineTo(208f, 128f)
                        lineTo(128f, 48f)
                        lineTo(68.32f, 70.38f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.08f, 6.17f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 128f)
                        lineToRelative(29.66f, -29.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                        lineTo(169f, 18.34f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.31f, 0f)
                        lineTo(128f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(124f, 132f)
                        moveToRelative(-20f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40.01f, 216f)
                        lineTo(109.86f, 146.14f)
                    }
                }.build()

        return _PenNibThin!!
    }

@Suppress("ObjectPropertyName")
private var _PenNibThin: ImageVector? = null
