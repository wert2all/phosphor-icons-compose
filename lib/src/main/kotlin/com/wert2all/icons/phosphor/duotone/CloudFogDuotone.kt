package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CloudFogDuotone: ImageVector
    get() {
        if (_CloudFogDuotone != null) {
            return _CloudFogDuotone!!
        }
        _CloudFogDuotone =
            ImageVector
                .Builder(
                    name = "CloudFogDuotone",
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
                        moveTo(156f, 32f)
                        arcTo(68.16f, 68.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.19f, 82.45f)
                        verticalLineToRelative(-0.11f)
                        arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = false, 76f, 168f)
                        horizontalLineToRelative(80f)
                        arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -136f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 200f)
                        lineTo(72f, 200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 200f)
                        lineTo(160f, 200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 232f)
                        lineTo(104f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 96f)
                        arcToRelative(68.06f, 68.06f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 72f)
                        horizontalLineTo(76f)
                        arcTo(44f, 44f, 0f, isMoreThanHalf = true, isPositiveArc = true, 90.2f, 82.34f)
                    }
                }.build()

        return _CloudFogDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFogDuotone: ImageVector? = null
