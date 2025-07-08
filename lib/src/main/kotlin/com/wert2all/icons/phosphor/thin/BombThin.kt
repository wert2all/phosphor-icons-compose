package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.BombThin: ImageVector
    get() {
        if (_BombThin != null) {
            return _BombThin!!
        }
        _BombThin =
            ImageVector
                .Builder(
                    name = "Thin.BombThin",
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
                        moveTo(88f, 64f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(86.66f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                        verticalLineTo(72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 64f)
                        reflectiveCurveToRelative(0f, -40f, 32f, -40f)
                        reflectiveCurveToRelative(40f, 56f, 72f, 56f)
                        reflectiveCurveToRelative(32f, -40f, 32f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 208f)
                        arcToRelative(49.52f, 49.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
                    }
                }.build()

        return _BombThin!!
    }

@Suppress("ObjectPropertyName")
private var _BombThin: ImageVector? = null
