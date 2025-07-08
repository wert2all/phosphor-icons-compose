package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.CurrencyRubThin: ImageVector
    get() {
        if (_CurrencyRubThin != null) {
            return _CurrencyRubThin!!
        }
        _CurrencyRubThin =
            ImageVector
                .Builder(
                    name = "Thin.CurrencyRubThin",
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
                        moveTo(56f, 176f)
                        lineTo(144f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 216f)
                        verticalLineTo(40f)
                        horizontalLineToRelative(60f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 104f)
                        horizontalLineTo(56f)
                    }
                }.build()

        return _CurrencyRubThin!!
    }

@Suppress("ObjectPropertyName")
private var _CurrencyRubThin: ImageVector? = null
