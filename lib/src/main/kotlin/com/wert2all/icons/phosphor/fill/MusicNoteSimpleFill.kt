package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.MusicNoteSimpleFill: ImageVector
    get() {
        if (_MusicNoteSimpleFill != null) {
            return _MusicNoteSimpleFill!!
        }
        _MusicNoteSimpleFill =
            ImageVector
                .Builder(
                    name = "MusicNoteSimpleFill",
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
                        verticalLineTo(50.75f)
                        lineToRelative(69.7f, 20.91f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.6f, -15.32f)
                        close()
                    }
                }.build()

        return _MusicNoteSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _MusicNoteSimpleFill: ImageVector? = null
