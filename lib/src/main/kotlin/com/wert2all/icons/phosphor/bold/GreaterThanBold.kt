package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.GreaterThanBold: ImageVector
    get() {
        if (_GreaterThanBold != null) {
            return _GreaterThanBold!!
        }
        _GreaterThanBold =
            ImageVector
                .Builder(
                    name = "Bold.GreaterThanBold",
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
                        moveTo(64f, 56f)
                        lineToRelative(152f, 72f)
                        lineToRelative(-152f, 72f)
                    }
                }.build()

        return _GreaterThanBold!!
    }

@Suppress("ObjectPropertyName")
private var _GreaterThanBold: ImageVector? = null
