package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.MopedFrontDuotone: ImageVector
    get() {
        if (_MopedFrontDuotone != null) {
            return _MopedFrontDuotone!!
        }
        _MopedFrontDuotone =
            ImageVector
                .Builder(
                    name = "MopedFrontDuotone",
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
                        moveTo(128f, 144f)
                        lineTo(128f, 144f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 168f)
                        lineTo(152f, 216f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 240f)
                        lineTo(128f, 240f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                        lineTo(104f, 168f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 48f)
                        moveToRelative(-32f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 144f)
                        lineTo(128f, 144f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 168f)
                        lineTo(152f, 216f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 240f)
                        lineTo(128f, 240f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 216f)
                        lineTo(104f, 168f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 48f)
                        moveToRelative(-32f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 48f)
                        lineTo(208f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 48f)
                        lineTo(96f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 208f)
                        horizontalLineTo(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(136f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, -56f)
                        horizontalLineToRelative(0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
                        verticalLineToRelative(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(152f)
                    }
                }.build()

        return _MopedFrontDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MopedFrontDuotone: ImageVector? = null
