package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_MicrosoftPowerpointLogo != null) {
            return _MicrosoftPowerpointLogo!!
        }
        _MicrosoftPowerpointLogo =
            ImageVector
                .Builder(
                    name = "MicrosoftPowerpointLogo",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 184f)
                        lineTo(136f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 32f)
                        lineTo(136f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 128f)
                        lineTo(232f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 72f)
                        lineTo(144f, 72f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 80f)
                        lineTo(152f, 176f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 184f)
                        lineTo(40f, 184f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 176f)
                        lineTo(32f, 80f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 136f)
                        horizontalLineTo(96f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                        horizontalLineTo(80f)
                        verticalLineToRelative(48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(58f, 72f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 112f)
                    }
                }.build()

        return _MicrosoftPowerpointLogo!!
    }

@Suppress("ObjectPropertyName")
private var _MicrosoftPowerpointLogo: ImageVector? = null
