package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ScanDuotone: ImageVector
    get() {
        if (_ScanDuotone != null) {
            return _ScanDuotone!!
        }
        _ScanDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ScanDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(80f, 80f)
                        horizontalLineToRelative(96f)
                        verticalLineToRelative(96f)
                        horizontalLineToRelative(-96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        lineToRelative(40f, 0f)
                        lineToRelative(0f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 216f)
                        lineToRelative(-40f, 0f)
                        lineToRelative(0f, -40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 176f)
                        lineToRelative(0f, 40f)
                        lineToRelative(-40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 80f)
                        lineToRelative(0f, -40f)
                        lineToRelative(40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 80f)
                        horizontalLineToRelative(96f)
                        verticalLineToRelative(96f)
                        horizontalLineToRelative(-96f)
                        close()
                    }
                }.build()

        return _ScanDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ScanDuotone: ImageVector? = null
