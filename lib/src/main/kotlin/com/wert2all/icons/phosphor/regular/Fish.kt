package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Fish: ImageVector
    get() {
        if (_Fish != null) {
            return _Fish!!
        }
        _Fish =
            ImageVector
                .Builder(
                    name = "Regular.Fish",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(156f, 76f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(8f, 175.87f)
                        lineToRelative(56.07f, 16.06f)
                        lineToRelative(16f, 56.07f)
                        lineToRelative(24f, -56.07f)
                        curveTo(258.51f, 188.26f, 220f, 38.68f, 219f, 37f)
                        curveToRelative(-1.73f, -1f, -151.25f, -39.46f, -155f, 114.9f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(185.82f, 167.62f)
                        arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.2f, 119.8f)
                        arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.38f, 70.21f)
                    }
                }.build()

        return _Fish!!
    }

@Suppress("ObjectPropertyName")
private var _Fish: ImageVector? = null
