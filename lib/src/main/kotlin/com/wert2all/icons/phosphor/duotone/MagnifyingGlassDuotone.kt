package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.MagnifyingGlassDuotone: ImageVector
    get() {
        if (_MagnifyingGlassDuotone != null) {
            return _MagnifyingGlassDuotone!!
        }
        _MagnifyingGlassDuotone =
            ImageVector
                .Builder(
                    name = "MagnifyingGlassDuotone",
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
                        moveTo(112f, 112f)
                        moveToRelative(-80f, 0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 112f)
                        moveToRelative(-80f, 0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168.57f, 168.57f)
                        lineTo(224f, 224f)
                    }
                }.build()

        return _MagnifyingGlassDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassDuotone: ImageVector? = null
