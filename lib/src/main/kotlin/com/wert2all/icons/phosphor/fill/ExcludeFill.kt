package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.ExcludeFill: ImageVector
    get() {
        if (_ExcludeFill != null) {
            return _ExcludeFill!!
        }
        _ExcludeFill =
            ImageVector
                .Builder(
                    name = "Fill.ExcludeFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(240f, 160f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 81.36f, 174.64f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.28f, -93.28f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 160f)
                        close()
                        moveTo(160f, 80f)
                        arcToRelative(80.29f, 80.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 1.36f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -93.28f, 93.28f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 80f)
                        close()
                    }
                }.build()

        return _ExcludeFill!!
    }

@Suppress("ObjectPropertyName")
private var _ExcludeFill: ImageVector? = null
