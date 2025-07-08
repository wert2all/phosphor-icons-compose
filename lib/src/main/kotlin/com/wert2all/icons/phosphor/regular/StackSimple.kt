package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.StackSimple: ImageVector
    get() {
        if (_StackSimple != null) {
            return _StackSimple!!
        }
        _StackSimple =
            ImageVector
                .Builder(
                    name = "Regular.StackSimple",
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
                        moveTo(16f, 104f)
                        lineToRelative(112f, 64f)
                        lineToRelative(112f, -64f)
                        lineToRelative(-112f, -64f)
                        lineToRelative(-112f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 144f)
                        lineToRelative(112f, 64f)
                        lineToRelative(112f, -64f)
                    }
                }.build()

        return _StackSimple!!
    }

@Suppress("ObjectPropertyName")
private var _StackSimple: ImageVector? = null
