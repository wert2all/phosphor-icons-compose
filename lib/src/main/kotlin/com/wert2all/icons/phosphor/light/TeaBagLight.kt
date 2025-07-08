package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.TeaBagLight: ImageVector
    get() {
        if (_TeaBagLight != null) {
            return _TeaBagLight!!
        }
        _TeaBagLight =
            ImageVector
                .Builder(
                    name = "Light.TeaBagLight",
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
                        moveTo(160f, 216f)
                        verticalLineTo(122.22f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, -4.12f)
                        lineTo(138.33f, 83.88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 131.47f, 80f)
                        horizontalLineTo(76.53f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, 3.88f)
                        lineTo(49.14f, 118.1f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 122.22f)
                        verticalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 216f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 168f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
                        verticalLineTo(64f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
                        horizontalLineToRelative(0f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
                        verticalLineToRelative(72f)
                    }
                }.build()

        return _TeaBagLight!!
    }

@Suppress("ObjectPropertyName")
private var _TeaBagLight: ImageVector? = null
