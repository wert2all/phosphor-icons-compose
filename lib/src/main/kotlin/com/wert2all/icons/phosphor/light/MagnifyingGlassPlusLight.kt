package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.MagnifyingGlassPlusLight: ImageVector
    get() {
        if (_MagnifyingGlassPlusLight != null) {
            return _MagnifyingGlassPlusLight!!
        }
        _MagnifyingGlassPlusLight =
            ImageVector
                .Builder(
                    name = "MagnifyingGlassPlusLight",
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
                        moveTo(80f, 112f)
                        lineTo(144f, 112f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168.57f, 168.57f)
                        lineTo(224f, 224f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 80f)
                        lineTo(112f, 144f)
                    }
                }.build()

        return _MagnifyingGlassPlusLight!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyingGlassPlusLight: ImageVector? = null
