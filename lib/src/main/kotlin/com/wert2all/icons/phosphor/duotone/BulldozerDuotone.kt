package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.BulldozerDuotone: ImageVector
    get() {
        if (_BulldozerDuotone != null) {
            return _BulldozerDuotone!!
        }
        _BulldozerDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.BulldozerDuotone",
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
                        moveTo(40f, 144f)
                        lineTo(160f, 144f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
                        lineTo(192f, 176f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 208f)
                        lineTo(40f, 208f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 176f)
                        lineTo(8f, 176f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 144f)
                        lineTo(160f, 144f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
                        lineTo(192f, 176f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 208f)
                        lineTo(40f, 208f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 176f)
                        lineTo(8f, 176f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 48f)
                        lineTo(56f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(248f, 144f)
                        horizontalLineToRelative(-8f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                        verticalLineToRelative(32f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        horizontalLineToRelative(8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 176f)
                        lineTo(224f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 176f)
                        lineTo(160f, 176f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 154.83f)
                        verticalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(90.67f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.38f, 4.92f)
                        lineTo(160f, 144f)
                    }
                }.build()

        return _BulldozerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BulldozerDuotone: ImageVector? = null
