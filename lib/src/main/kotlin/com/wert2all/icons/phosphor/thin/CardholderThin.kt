package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CardholderThin: ImageVector
    get() {
        if (_CardholderThin != null) {
            return _CardholderThin!!
        }
        _CardholderThin =
            ImageVector
                .Builder(
                    name = "CardholderThin",
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
                        moveTo(48f, 56f)
                        lineTo(208f, 56f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 72f)
                        lineTo(224f, 184f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 200f)
                        lineTo(48f, 200f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 184f)
                        lineTo(32f, 72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 120f)
                        horizontalLineTo(96f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 0f)
                        horizontalLineToRelative(64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 88f)
                        lineTo(224f, 88f)
                    }
                }.build()

        return _CardholderThin!!
    }

@Suppress("ObjectPropertyName")
private var _CardholderThin: ImageVector? = null
