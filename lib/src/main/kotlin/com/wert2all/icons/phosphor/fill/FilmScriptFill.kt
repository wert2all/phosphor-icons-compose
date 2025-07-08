package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.FilmScriptFill: ImageVector
    get() {
        if (_FilmScriptFill != null) {
            return _FilmScriptFill!!
        }
        _FilmScriptFill =
            ImageVector
                .Builder(
                    name = "Fill.FilmScriptFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(200f, 24f)
                        lineTo(56f, 24f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                        lineTo(40f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(200f, 232f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(216f, 40f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 24f)
                        close()
                        moveTo(76f, 188f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 188f)
                        close()
                        moveTo(76f, 140f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 140f)
                        close()
                        moveTo(76f, 92f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, 80f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 92f)
                        close()
                    }
                }.build()

        return _FilmScriptFill!!
    }

@Suppress("ObjectPropertyName")
private var _FilmScriptFill: ImageVector? = null
