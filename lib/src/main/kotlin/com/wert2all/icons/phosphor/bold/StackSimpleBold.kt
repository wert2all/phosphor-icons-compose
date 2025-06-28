package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.StackSimpleBold: ImageVector
    get() {
        if (_StackSimpleBold != null) {
            return _StackSimpleBold!!
        }
        _StackSimpleBold =
            ImageVector
                .Builder(
                    name = "StackSimpleBold",
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
                        moveTo(16f, 100f)
                        lineToRelative(112f, 64f)
                        lineToRelative(112f, -64f)
                        lineToRelative(-112f, -64f)
                        lineToRelative(-112f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 148f)
                        lineToRelative(112f, 64f)
                        lineToRelative(112f, -64f)
                    }
                }.build()

        return _StackSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _StackSimpleBold: ImageVector? = null
