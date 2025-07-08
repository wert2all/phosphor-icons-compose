package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.WifiNoneDuotone: ImageVector
    get() {
        if (_WifiNoneDuotone != null) {
            return _WifiNoneDuotone!!
        }
        _WifiNoneDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.WifiNoneDuotone",
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
                        moveTo(134.15f, 213.12f)
                        lineToRelative(104f, -125.43f)
                        arcToRelative(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.31f, -11.21f)
                        arcToRelative(180.75f, 180.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -217.78f, 0f)
                        arcTo(7.79f, 7.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.8f, 87.69f)
                        lineTo(121.85f, 213.12f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 134.15f, 213.12f)
                        close()
                    }
                }.build()

        return _WifiNoneDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _WifiNoneDuotone: ImageVector? = null
