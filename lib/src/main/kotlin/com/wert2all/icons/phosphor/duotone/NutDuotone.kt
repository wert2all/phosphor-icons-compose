package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.NutDuotone: ImageVector
    get() {
        if (_NutDuotone != null) {
            return _NutDuotone!!
        }
        _NutDuotone =
            ImageVector
                .Builder(
                    name = "NutDuotone",
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
                        moveTo(219.84f, 73.16f)
                        lineTo(131.84f, 25f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.68f, 0f)
                        lineToRelative(-88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.16f, 7f)
                        verticalLineToRelative(95.64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, 7f)
                        lineToRelative(88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.68f, 0f)
                        lineToRelative(88f, -48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.16f, -7f)
                        verticalLineTo(80.18f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 219.84f, 73.16f)
                        close()
                        moveTo(128f, 168f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
                        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 168f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 128f)
                        moveToRelative(-40f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(219.84f, 182.84f)
                        lineToRelative(-88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.68f, 0f)
                        lineToRelative(-88f, -48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.16f, -7f)
                        verticalLineTo(80.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, -7f)
                        lineToRelative(88f, -48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.68f, 0f)
                        lineToRelative(88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 7f)
                        verticalLineToRelative(95.64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 219.84f, 182.84f)
                        close()
                    }
                }.build()

        return _NutDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NutDuotone: ImageVector? = null
