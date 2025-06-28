package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MusicNoteFill: ImageVector
    get() {
        if (_MusicNoteFill != null) {
            return _MusicNoteFill!!
        }
        _MusicNoteFill =
            ImageVector
                .Builder(
                    name = "MusicNoteFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(210.3f, 56.34f)
                        lineToRelative(-80f, -24f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 40f)
                        verticalLineTo(148.26f)
                        arcTo(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 136f, 184f)
                        verticalLineTo(98.75f)
                        lineToRelative(69.7f, 20.91f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 112f)
                        verticalLineTo(64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 210.3f, 56.34f)
                        close()
                    }
                }.build()

        return _MusicNoteFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteFill: ImageVector? = null
