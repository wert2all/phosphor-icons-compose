package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.PaperPlaneRight: ImageVector
    get() {
        if (_PaperPlaneRight != null) {
            return _PaperPlaneRight!!
        }
        _PaperPlaneRight =
            ImageVector
                .Builder(
                    name = "Regular.PaperPlaneRight",
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
                        moveTo(144f, 128f)
                        lineTo(80f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48.49f, 221.28f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 59.93f, 231f)
                        lineToRelative(168f, -96.09f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -14f)
                        lineToRelative(-168f, -95.85f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.44f, 9.67f)
                        lineTo(80f, 128f)
                        close()
                    }
                }.build()

        return _PaperPlaneRight!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneRight: ImageVector? = null
