package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.PaperPlane: ImageVector
    get() {
        if (_PaperPlane != null) {
            return _PaperPlane!!
        }
        _PaperPlane =
            ImageVector
                .Builder(
                    name = "PaperPlane",
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
                        moveTo(128f, 120f)
                        lineTo(128f, 184f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 184f)
                        lineToRelative(93.28f, 31.51f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231f, 204.07f)
                        lineToRelative(-96.09f, -168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                        lineToRelative(-95.85f, 168f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.67f, 11.44f)
                        close()
                    }
                }.build()

        return _PaperPlane!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlane: ImageVector? = null
