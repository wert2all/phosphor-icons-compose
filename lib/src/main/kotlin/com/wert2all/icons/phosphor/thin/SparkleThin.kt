package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.SparkleThin: ImageVector
    get() {
        if (_SparkleThin != null) {
            return _SparkleThin!!
        }
        _SparkleThin =
            ImageVector
                .Builder(
                    name = "SparkleThin",
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
                        moveTo(84.27f, 171.73f)
                        lineToRelative(-55.09f, -20.3f)
                        arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -14.86f)
                        lineToRelative(55.09f, -20.3f)
                        lineToRelative(20.3f, -55.09f)
                        arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.86f, 0f)
                        lineToRelative(20.3f, 55.09f)
                        lineToRelative(55.09f, 20.3f)
                        arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 14.86f)
                        lineToRelative(-55.09f, 20.3f)
                        lineToRelative(-20.3f, 55.09f)
                        arcToRelative(7.92f, 7.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.86f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 16f)
                        lineTo(176f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 72f)
                        lineTo(224f, 104f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 40f)
                        lineTo(200f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 88f)
                        lineTo(240f, 88f)
                    }
                }.build()

        return _SparkleThin!!
    }

@Suppress("ObjectPropertyName")
private var _SparkleThin: ImageVector? = null
