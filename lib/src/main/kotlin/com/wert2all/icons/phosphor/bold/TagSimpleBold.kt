package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.TagSimpleBold: ImageVector
    get() {
        if (_TagSimpleBold != null) {
            return _TagSimpleBold!!
        }
        _TagSimpleBold =
            ImageVector
                .Builder(
                    name = "Bold.TagSimpleBold",
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
                        moveTo(194.37f, 196.44f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineTo(192f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineTo(187.72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 194.37f, 196.44f)
                        close()
                    }
                }.build()

        return _TagSimpleBold!!
    }

@Suppress("ObjectPropertyName")
private var _TagSimpleBold: ImageVector? = null
