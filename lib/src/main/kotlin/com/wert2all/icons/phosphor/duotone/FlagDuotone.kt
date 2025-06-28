package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FlagDuotone: ImageVector
    get() {
        if (_FlagDuotone != null) {
            return _FlagDuotone!!
        }
        _FlagDuotone =
            ImageVector
                .Builder(
                    name = "FlagDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(48f, 176f)
                        curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                        verticalLineTo(56f)
                        curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 224f)
                        lineTo(48f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 176f)
                        curveToRelative(64f, -55.43f, 112f, 55.43f, 176f, 0f)
                        verticalLineTo(56f)
                        curveTo(160f, 111.43f, 112f, 0.57f, 48f, 56f)
                    }
                }.build()

        return _FlagDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FlagDuotone: ImageVector? = null
