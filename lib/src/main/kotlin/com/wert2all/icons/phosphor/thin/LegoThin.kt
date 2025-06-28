package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.LegoThin: ImageVector
    get() {
        if (_LegoThin != null) {
            return _LegoThin!!
        }
        _LegoThin =
            ImageVector
                .Builder(
                    name = "LegoThin",
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
                        moveTo(80f, 160f)
                        lineTo(80f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 100f)
                        arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                        arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 60f)
                        arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                        arcToRelative(32f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 128f)
                        lineToRelative(64f, 32f)
                        lineToRelative(160f, -80f)
                        lineToRelative(-48.77f, -24.39f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(132.19f, 69.9f)
                        lineTo(101.56f, 85.22f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(240f, 80f)
                        lineToRelative(0f, 64f)
                        lineToRelative(-160f, 80f)
                        lineToRelative(-64f, -32f)
                        lineToRelative(0f, -64f)
                        lineToRelative(36.19f, -18.1f)
                    }
                }.build()

        return _LegoThin!!
    }

@Suppress("ObjectPropertyName")
private var _LegoThin: ImageVector? = null
