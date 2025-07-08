package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.CloudSlashBold: ImageVector
    get() {
        if (_CloudSlashBold != null) {
            return _CloudSlashBold!!
        }
        _CloudSlashBold =
            ImageVector
                .Builder(
                    name = "Bold.CloudSlashBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 40f)
                        lineTo(208f, 216f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(193.89f, 200.49f)
                        arcTo(79.66f, 79.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 208f)
                        horizontalLineTo(72f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.92f, 97.74f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(80f, 128f)
                        arcTo(79.68f, 79.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 91.07f, 87.37f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(119.39f, 59.06f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224.76f, 175f)
                    }
                }.build()

        return _CloudSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _CloudSlashBold: ImageVector? = null
