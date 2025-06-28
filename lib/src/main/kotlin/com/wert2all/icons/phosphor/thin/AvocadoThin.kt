package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.AvocadoThin: ImageVector
    get() {
        if (_AvocadoThin != null) {
            return _AvocadoThin!!
        }
        _AvocadoThin =
            ImageVector
                .Builder(
                    name = "AvocadoThin",
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
                        moveTo(128f, 160f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(82.73f, 48f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.9f, 1f)
                        lineToRelative(29.82f, 84.28f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -150.26f, -1.74f)
                        close()
                    }
                }.build()

        return _AvocadoThin!!
    }

@Suppress("ObjectPropertyName")
private var _AvocadoThin: ImageVector? = null
