package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.PrescriptionDuotone: ImageVector
    get() {
        if (_PrescriptionDuotone != null) {
            return _PrescriptionDuotone!!
        }
        _PrescriptionDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.PrescriptionDuotone",
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
                        moveTo(72f, 128f)
                        horizontalLineToRelative(52f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -88f)
                        horizontalLineTo(72f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 128f)
                        horizontalLineToRelative(52f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -88f)
                        horizontalLineTo(72f)
                        verticalLineTo(192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 128f)
                        lineTo(200f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 160f)
                        lineTo(144f, 216f)
                    }
                }.build()

        return _PrescriptionDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _PrescriptionDuotone: ImageVector? = null
