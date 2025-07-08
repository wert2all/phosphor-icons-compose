package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TidalLogoThin: ImageVector
    get() {
        if (_TidalLogoThin != null) {
            return _TidalLogoThin!!
        }
        _TidalLogoThin =
            ImageVector
                .Builder(
                    name = "Thin.TidalLogoThin",
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
                        moveTo(8.01f, 96f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 96f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 176f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168.01f, 96f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                }.build()

        return _TidalLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _TidalLogoThin: ImageVector? = null
