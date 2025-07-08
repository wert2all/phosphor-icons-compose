package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.SketchLogoThin: ImageVector
    get() {
        if (_SketchLogoThin != null) {
            return _SketchLogoThin!!
        }
        _SketchLogoThin =
            ImageVector
                .Builder(
                    name = "Thin.SketchLogoThin",
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
                        moveTo(72f, 40f)
                        lineToRelative(112f, 0f)
                        lineToRelative(56f, 64f)
                        lineToRelative(-112f, 120f)
                        lineToRelative(-112f, -120f)
                        lineToRelative(56f, -64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 104f)
                        lineToRelative(-48f, 120f)
                        lineToRelative(-48f, -120f)
                        lineToRelative(48f, -64f)
                        lineToRelative(48f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 104f)
                        lineTo(240f, 104f)
                    }
                }.build()

        return _SketchLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _SketchLogoThin: ImageVector? = null
