package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.InfinityThin: ImageVector
    get() {
        if (_InfinityThin != null) {
            return _InfinityThin!!
        }
        _InfinityThin =
            ImageVector
                .Builder(
                    name = "Thin.InfinityThin",
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
                        moveTo(106.63f, 152.13f)
                        lineToRelative(-8.69f, 9.81f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -67.88f)
                        lineToRelative(60.12f, 67.88f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -67.88f)
                        lineToRelative(-8.69f, 9.81f)
                    }
                }.build()

        return _InfinityThin!!
    }

@Suppress("ObjectPropertyName")
private var _InfinityThin: ImageVector? = null
