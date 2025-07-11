package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.RadicalBold: ImageVector
    get() {
        if (_RadicalBold != null) {
            return _RadicalBold!!
        }
        _RadicalBold =
            ImageVector
                .Builder(
                    name = "Bold.RadicalBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(240f, 104f)
                        lineToRelative(0f, -24f)
                        lineToRelative(-112f, 0f)
                        lineToRelative(-48f, 128f)
                        lineToRelative(-48f, -128f)
                    }
                }.build()

        return _RadicalBold!!
    }

@Suppress("ObjectPropertyName")
private var _RadicalBold: ImageVector? = null
