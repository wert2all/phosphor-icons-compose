package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.BehanceLogoThin: ImageVector
    get() {
        if (_BehanceLogoThin != null) {
            return _BehanceLogoThin!!
        }
        _BehanceLogoThin =
            ImageVector
                .Builder(
                    name = "Thin.BehanceLogoThin",
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
                        moveTo(32f, 124f)
                        horizontalLineTo(94f)
                        arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 68f)
                        horizontalLineTo(32f)
                        verticalLineTo(64f)
                        horizontalLineTo(90f)
                        arcToRelative(30f, 30f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 60f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 80f)
                        lineTo(232f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(232f, 176f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, -24f)
                        horizontalLineTo(160f)
                    }
                }.build()

        return _BehanceLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _BehanceLogoThin: ImageVector? = null
