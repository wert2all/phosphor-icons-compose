package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Binary: ImageVector
    get() {
        if (_Binary != null) {
            return _Binary!!
        }
        _Binary =
            ImageVector
                .Builder(
                    name = "Regular.Binary",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 72f)
                        arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                        arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 184f)
                        arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                        arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 112f)
                        lineToRelative(0f, -80f)
                        lineToRelative(-24f, 13.33f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 224f)
                        lineToRelative(0f, -80f)
                        lineToRelative(-24f, 13.33f)
                    }
                }.build()

        return _Binary!!
    }

@Suppress("ObjectPropertyName")
private var _Binary: ImageVector? = null
