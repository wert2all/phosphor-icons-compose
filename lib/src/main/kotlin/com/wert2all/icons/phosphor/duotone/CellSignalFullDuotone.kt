package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.CellSignalFullDuotone: ImageVector
    get() {
        if (_CellSignalFullDuotone != null) {
            return _CellSignalFullDuotone!!
        }
        _CellSignalFullDuotone =
            ImageVector
                .Builder(
                    name = "CellSignalFullDuotone",
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
                        moveTo(200f, 200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(160f, -160f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, -13.66f)
                        lineToRelative(160f, -160f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 40f)
                        close()
                    }
                }.build()

        return _CellSignalFullDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CellSignalFullDuotone: ImageVector? = null
