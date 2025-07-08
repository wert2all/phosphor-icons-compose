package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.CellTowerDuotone: ImageVector
    get() {
        if (_CellTowerDuotone != null) {
            return _CellTowerDuotone!!
        }
        _CellTowerDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.CellTowerDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 16f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 95.8f, 152.4f)
                        lineTo(128f, 88f)
                        lineToRelative(32.2f, 64.4f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 16f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 232f)
                        lineToRelative(72f, -144f)
                        lineToRelative(72f, 144f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.64f, 95.17f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 78.72f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(70.53f, 131.38f)
                        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 114.94f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 200f)
                        lineTo(184f, 200f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 168f)
                        lineTo(168f, 168f)
                    }
                }.build()

        return _CellTowerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CellTowerDuotone: ImageVector? = null
