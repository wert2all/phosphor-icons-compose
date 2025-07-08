package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TagSimpleThin: ImageVector
    get() {
        if (_TagSimpleThin != null) {
            return _TagSimpleThin!!
        }
        _TagSimpleThin =
            ImageVector
                .Builder(
                    name = "Thin.TagSimpleThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _TagSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _TagSimpleThin: ImageVector? = null
