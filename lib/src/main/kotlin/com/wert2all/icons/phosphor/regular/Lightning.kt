package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.Lightning: ImageVector
    get() {
        if (_Lightning != null) {
            return _Lightning!!
        }
        _Lightning =
            ImageVector
                .Builder(
                    name = "Regular.Lightning",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 16f)
                        lineToRelative(-16f, 80f)
                        lineToRelative(64f, 24f)
                        lineToRelative(-112f, 120f)
                        lineToRelative(16f, -80f)
                        lineToRelative(-64f, -24f)
                        lineToRelative(112f, -120f)
                        close()
                    }
                }.build()

        return _Lightning!!
    }

@Suppress("ObjectPropertyName")
private var _Lightning: ImageVector? = null
