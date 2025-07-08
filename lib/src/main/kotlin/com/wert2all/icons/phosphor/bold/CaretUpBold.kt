package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CaretUpBold: ImageVector
    get() {
        if (_CaretUpBold != null) {
            return _CaretUpBold!!
        }
        _CaretUpBold =
            ImageVector
                .Builder(
                    name = "Bold.CaretUpBold",
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
                        moveTo(48f, 160f)
                        lineToRelative(80f, -80f)
                        lineToRelative(80f, 80f)
                    }
                }.build()

        return _CaretUpBold!!
    }

@Suppress("ObjectPropertyName")
private var _CaretUpBold: ImageVector? = null
