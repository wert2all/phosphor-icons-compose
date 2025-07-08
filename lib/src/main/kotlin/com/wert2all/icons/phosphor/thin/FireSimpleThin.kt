package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.FireSimpleThin: ImageVector
    get() {
        if (_FireSimpleThin != null) {
            return _FireSimpleThin!!
        }
        _FireSimpleThin =
            ImageVector
                .Builder(
                    name = "Thin.FireSimpleThin",
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
                        moveTo(112f, 96f)
                        lineToRelative(26.27f, -72f)
                        curveTo(159.86f, 41.92f, 208f, 88.15f, 208f, 144f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -160f, 0f)
                        curveToRelative(0f, -30.57f, 14.42f, -58.26f, 31f, -80f)
                        close()
                    }
                }.build()

        return _FireSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _FireSimpleThin: ImageVector? = null
