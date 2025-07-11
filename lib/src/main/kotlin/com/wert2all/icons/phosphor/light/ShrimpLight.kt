package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ShrimpLight: ImageVector
    get() {
        if (_ShrimpLight != null) {
            return _ShrimpLight!!
        }
        _ShrimpLight =
            ImageVector
                .Builder(
                    name = "Light.ShrimpLight",
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
                        moveTo(112f, 152f)
                        lineTo(112f, 80f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(148f, 116f)
                        moveToRelative(-10f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, 0f)
                        arcToRelative(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, -20f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 192f)
                        lineTo(112f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 24f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(84f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 192f)
                        horizontalLineTo(112f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -40f)
                        horizontalLineToRelative(32f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72f)
                        horizontalLineTo(96f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 144f)
                        horizontalLineToRelative(56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(95.6f, 160.55f)
                        lineTo(27.55f, 129.61f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(92.69f, 177.22f)
                        lineTo(50.21f, 207.56f)
                    }
                }.build()

        return _ShrimpLight!!
    }

@Suppress("ObjectPropertyName")
private var _ShrimpLight: ImageVector? = null
