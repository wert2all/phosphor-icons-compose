package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.Hurricane: ImageVector
    get() {
        if (_Hurricane != null) {
            return _Hurricane!!
        }
        _Hurricane =
            ImageVector
                .Builder(
                    name = "Hurricane",
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
                        moveTo(128f, 128f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(148.62f, 50.68f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 128f)
                        curveToRelative(0f, 96f, -112f, 120f, -112f, 120f)
                        lineToRelative(11.38f, -42.68f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 128f)
                        curveTo(48f, 32f, 160f, 8f, 160f, 8f)
                        close()
                    }
                }.build()

        return _Hurricane!!
    }

@Suppress("ObjectPropertyName")
private var _Hurricane: ImageVector? = null
