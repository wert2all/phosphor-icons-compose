package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.PrescriptionThin: ImageVector
    get() {
        if (_PrescriptionThin != null) {
            return _PrescriptionThin!!
        }
        _PrescriptionThin =
            ImageVector
                .Builder(
                    name = "Thin.PrescriptionThin",
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
                        moveTo(72f, 128f)
                        horizontalLineToRelative(52f)
                        arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -88f)
                        horizontalLineTo(72f)
                        verticalLineTo(192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(112f, 128f)
                        lineTo(200f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 160f)
                        lineTo(144f, 216f)
                    }
                }.build()

        return _PrescriptionThin!!
    }

@Suppress("ObjectPropertyName")
private var _PrescriptionThin: ImageVector? = null
