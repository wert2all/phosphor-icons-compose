package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TagChevronThin: ImageVector
    get() {
        if (_TagChevronThin != null) {
            return _TagChevronThin!!
        }
        _TagChevronThin =
            ImageVector
                .Builder(
                    name = "Thin.TagChevronThin",
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
                        moveTo(32f, 200f)
                        horizontalLineTo(187.72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.56f)
                        lineTo(240f, 128f)
                        lineTo(194.37f, 59.56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 187.72f, 56f)
                        horizontalLineTo(32f)
                        lineToRelative(48f, 72f)
                        close()
                    }
                }.build()

        return _TagChevronThin!!
    }

@Suppress("ObjectPropertyName")
private var _TagChevronThin: ImageVector? = null
