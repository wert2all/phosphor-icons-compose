package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FactoryDuotone: ImageVector
    get() {
        if (_FactoryDuotone != null) {
            return _FactoryDuotone!!
        }
        _FactoryDuotone =
            ImageVector
                .Builder(
                    name = "FactoryDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(216f, 216f)
                        lineToRelative(0f, -80f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(0f, 128f)
                        lineToRelative(176f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 176f)
                        lineTo(108f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(148f, 176f)
                        lineTo(176f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 136f)
                        lineToRelative(-48f, 0f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(0f, 48f)
                        lineToRelative(-64f, -48f)
                        lineToRelative(0f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 216f)
                        lineTo(232f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(153.55f, 125.16f)
                        lineTo(167f, 30.87f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 174.94f, 24f)
                        horizontalLineToRelative(18.12f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201f, 30.87f)
                        lineTo(216f, 136f)
                        verticalLineToRelative(80f)
                    }
                }.build()

        return _FactoryDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FactoryDuotone: ImageVector? = null
