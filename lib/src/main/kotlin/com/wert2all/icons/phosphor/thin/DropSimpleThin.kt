package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.DropSimpleThin: ImageVector
    get() {
        if (_DropSimpleThin != null) {
            return _DropSimpleThin!!
        }
        _DropSimpleThin =
            ImageVector
                .Builder(
                    name = "Thin.DropSimpleThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _DropSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _DropSimpleThin: ImageVector? = null
