package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.NotSubsetOfThin: ImageVector
    get() {
        if (_NotSubsetOfThin != null) {
            return _NotSubsetOfThin!!
        }
        _NotSubsetOfThin =
            ImageVector
                .Builder(
                    name = "Thin.NotSubsetOfThin",
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
                        moveTo(208f, 40f)
                        lineTo(48f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 48f)
                        horizontalLineTo(128f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
                        horizontalLineToRelative(0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                        horizontalLineToRelative(72f)
                    }
                }.build()

        return _NotSubsetOfThin!!
    }

@Suppress("ObjectPropertyName")
private var _NotSubsetOfThin: ImageVector? = null
