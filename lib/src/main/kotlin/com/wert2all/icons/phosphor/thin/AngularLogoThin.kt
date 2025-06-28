package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.AngularLogoThin: ImageVector
    get() {
        if (_AngularLogoThin != null) {
            return _AngularLogoThin!!
        }
        _AngularLogoThin =
            ImageVector
                .Builder(
                    name = "AngularLogoThin",
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
                        moveTo(128f, 232f)
                        lineToRelative(80f, -40f)
                        lineToRelative(16f, -120f)
                        lineToRelative(-96f, -40f)
                        lineToRelative(-96f, 40f)
                        lineToRelative(16f, 120f)
                        lineToRelative(80f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 160f)
                        lineToRelative(-40f, -72f)
                        lineToRelative(-40f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(101.33f, 136f)
                        lineTo(154.67f, 136f)
                    }
                }.build()

        return _AngularLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _AngularLogoThin: ImageVector? = null
