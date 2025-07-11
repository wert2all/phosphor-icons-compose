package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.AsclepiusDuotone: ImageVector
    get() {
        if (_AsclepiusDuotone != null) {
            return _AsclepiusDuotone!!
        }
        _AsclepiusDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.AsclepiusDuotone",
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
                        moveTo(88f, 48f)
                        verticalLineToRelative(8f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                        horizontalLineTo(32f)
                        verticalLineTo(80f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 24f)
                        lineTo(128f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 166.11f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 184f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
                        horizontalLineTo(96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 48f)
                        horizontalLineToRelative(17f)
                        arcToRelative(31f, 31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31f, 31f)
                        verticalLineToRelative(1f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 32f)
                        horizontalLineTo(96f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 48f)
                        verticalLineToRelative(8f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 88f)
                        horizontalLineTo(32f)
                        verticalLineTo(80f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 48f)
                        horizontalLineTo(96f)
                    }
                }.build()

        return _AsclepiusDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AsclepiusDuotone: ImageVector? = null
