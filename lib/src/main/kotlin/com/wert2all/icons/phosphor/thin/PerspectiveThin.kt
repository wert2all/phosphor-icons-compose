package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.PerspectiveThin: ImageVector
    get() {
        if (_PerspectiveThin != null) {
            return _PerspectiveThin!!
        }
        _PerspectiveThin =
            ImageVector
                .Builder(
                    name = "PerspectiveThin",
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
                        moveTo(216f, 208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.43f, 7.87f)
                        lineToRelative(-160f, -29.09f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 178.91f)
                        verticalLineTo(77.09f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.57f, -7.87f)
                        lineToRelative(160f, -29.09f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(16f, 128f)
                        lineTo(240f, 128f)
                    }
                }.build()

        return _PerspectiveThin!!
    }

@Suppress("ObjectPropertyName")
private var _PerspectiveThin: ImageVector? = null
