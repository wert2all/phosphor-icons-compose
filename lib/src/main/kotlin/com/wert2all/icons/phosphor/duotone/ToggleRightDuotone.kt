package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ToggleRightDuotone: ImageVector
    get() {
        if (_ToggleRightDuotone != null) {
            return _ToggleRightDuotone!!
        }
        _ToggleRightDuotone =
            ImageVector
                .Builder(
                    name = "ToggleRightDuotone",
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
                        moveTo(176f, 128f)
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
                        moveTo(80f, 64f)
                        lineTo(176f, 64f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                        lineTo(240f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 192f)
                        lineTo(80f, 192f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 128f)
                        lineTo(16f, 128f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 64f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 128f)
                        moveToRelative(-32f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
                    }
                }.build()

        return _ToggleRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleRightDuotone: ImageVector? = null
