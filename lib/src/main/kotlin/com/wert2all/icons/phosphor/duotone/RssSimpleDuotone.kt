package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.RssSimpleDuotone: ImageVector
    get() {
        if (_RssSimpleDuotone != null) {
            return _RssSimpleDuotone!!
        }
        _RssSimpleDuotone =
            ImageVector
                .Builder(
                    name = "RssSimpleDuotone",
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
                        moveTo(64f, 192f)
                        verticalLineTo(40f)
                        arcTo(152f, 152f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 192f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 40f)
                        arcTo(152f, 152f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 112f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(68f, 188f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _RssSimpleDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RssSimpleDuotone: ImageVector? = null
