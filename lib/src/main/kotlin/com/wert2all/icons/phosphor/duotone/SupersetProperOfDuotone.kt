package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.SupersetProperOfDuotone: ImageVector
    get() {
        if (_SupersetProperOfDuotone != null) {
            return _SupersetProperOfDuotone!!
        }
        _SupersetProperOfDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.SupersetProperOfDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(64f, 208f)
                        horizontalLineToRelative(72f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                        horizontalLineTo(64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 208f)
                        horizontalLineToRelative(72f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -160f)
                        horizontalLineTo(64f)
                    }
                }.build()

        return _SupersetProperOfDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SupersetProperOfDuotone: ImageVector? = null
