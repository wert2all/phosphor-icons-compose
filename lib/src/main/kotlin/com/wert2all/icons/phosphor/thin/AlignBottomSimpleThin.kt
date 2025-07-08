package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.AlignBottomSimpleThin: ImageVector
    get() {
        if (_AlignBottomSimpleThin != null) {
            return _AlignBottomSimpleThin!!
        }
        _AlignBottomSimpleThin =
            ImageVector
                .Builder(
                    name = "Thin.AlignBottomSimpleThin",
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
                        moveTo(56f, 232f)
                        lineTo(200f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 32f)
                        lineTo(160f, 32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 40f)
                        lineTo(168f, 192f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 200f)
                        lineTo(96f, 200f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 192f)
                        lineTo(88f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 32f)
                        close()
                    }
                }.build()

        return _AlignBottomSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottomSimpleThin: ImageVector? = null
