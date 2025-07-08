package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.JarThin: ImageVector
    get() {
        if (_JarThin != null) {
            return _JarThin!!
        }
        _JarThin =
            ImageVector
                .Builder(
                    name = "Thin.JarThin",
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
                        moveTo(80f, 56f)
                        lineTo(176f, 56f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 88f)
                        lineTo(208f, 200f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 232f)
                        lineTo(80f, 232f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
                        lineTo(48f, 88f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 56f)
                        verticalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 56f)
                        lineTo(112f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(144f, 56f)
                        lineTo(144f, 24f)
                    }
                }.build()

        return _JarThin!!
    }

@Suppress("ObjectPropertyName")
private var _JarThin: ImageVector? = null
