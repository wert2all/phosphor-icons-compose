package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.DropSimple: ImageVector
    get() {
        if (_DropSimple != null) {
            return _DropSimple!!
        }
        _DropSimple =
            ImageVector
                .Builder(
                    name = "Regular.DropSimple",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 144f)
                        curveToRelative(0f, -72f, -80f, -128f, -80f, -128f)
                        reflectiveCurveTo(48f, 72f, 48f, 144f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                        close()
                    }
                }.build()

        return _DropSimple!!
    }

@Suppress("ObjectPropertyName")
private var _DropSimple: ImageVector? = null
