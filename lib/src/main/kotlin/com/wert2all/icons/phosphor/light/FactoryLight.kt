package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FactoryLight: ImageVector
    get() {
        if (_FactoryLight != null) {
            return _FactoryLight!!
        }
        _FactoryLight =
            ImageVector
                .Builder(
                    name = "Light.FactoryLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 176f)
                        lineTo(108f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(148f, 176f)
                        lineTo(176f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 216f)
                        lineTo(232f, 216f)
                    }
                }.build()

        return _FactoryLight!!
    }

@Suppress("ObjectPropertyName")
private var _FactoryLight: ImageVector? = null
