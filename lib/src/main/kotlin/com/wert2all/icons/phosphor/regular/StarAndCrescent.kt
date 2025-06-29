package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.StarAndCrescent: ImageVector
    get() {
        if (_StarAndCrescent != null) {
            return _StarAndCrescent!!
        }
        _StarAndCrescent =
            ImageVector
                .Builder(
                    name = "StarAndCrescent",
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
                        moveTo(152f, 206.4f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -156.8f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 156.8f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(177.46f, 128f)
                        lineToRelative(-17.46f, -29.67f)
                        lineToRelative(32.59f, 8.07f)
                        lineToRelative(21.8f, -26.4f)
                        lineToRelative(2.67f, 34.65f)
                        lineToRelative(30.94f, 13.35f)
                        lineToRelative(-30.94f, 13.35f)
                        lineToRelative(-2.67f, 34.65f)
                        lineToRelative(-21.8f, -26.4f)
                        lineToRelative(-32.59f, 8.07f)
                        lineToRelative(17.46f, -29.67f)
                        close()
                    }
                }.build()

        return _StarAndCrescent!!
    }

@Suppress("ObjectPropertyName")
private var _StarAndCrescent: ImageVector? = null
