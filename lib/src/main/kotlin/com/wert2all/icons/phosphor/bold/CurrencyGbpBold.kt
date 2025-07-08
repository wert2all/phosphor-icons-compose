package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CurrencyGbpBold: ImageVector
    get() {
        if (_CurrencyGbpBold != null) {
            return _CurrencyGbpBold!!
        }
        _CurrencyGbpBold =
            ImageVector
                .Builder(
                    name = "Bold.CurrencyGbpBold",
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
                        moveTo(56f, 128f)
                        lineTo(136f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 208f)
                        horizontalLineTo(60f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, -36f)
                        verticalLineTo(84f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, -33.95f)
                    }
                }.build()

        return _CurrencyGbpBold!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyGbpBold: ImageVector? = null
