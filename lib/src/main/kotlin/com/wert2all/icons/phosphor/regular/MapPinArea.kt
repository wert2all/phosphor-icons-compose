package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.MapPinArea: ImageVector
    get() {
        if (_MapPinArea != null) {
            return _MapPinArea!!
        }
        _MapPinArea =
            ImageVector
                .Builder(
                    name = "Regular.MapPinArea",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 80f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 80f)
                        curveToRelative(0f, 56f, -56f, 88f, -56f, 88f)
                        reflectiveCurveTo(72f, 136f, 72f, 80f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 155.14f)
                        curveToRelative(19.72f, 7.28f, 32f, 17.52f, 32f, 28.86f)
                        curveToRelative(0f, 22.09f, -46.56f, 40f, -104f, 40f)
                        reflectiveCurveTo(24f, 206.09f, 24f, 184f)
                        curveToRelative(0f, -11.34f, 12.28f, -21.58f, 32f, -28.86f)
                    }
                }.build()

        return _MapPinArea!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinArea: ImageVector? = null
