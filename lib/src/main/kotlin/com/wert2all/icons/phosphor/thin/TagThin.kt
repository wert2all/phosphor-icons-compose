package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TagThin: ImageVector
    get() {
        if (_TagThin != null) {
            return _TagThin!!
        }
        _TagThin =
            ImageVector
                .Builder(
                    name = "Thin.TagThin",
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
                        moveTo(42.34f, 138.34f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 132.69f)
                        verticalLineTo(40f)
                        horizontalLineToRelative(92.69f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                        lineToRelative(99.32f, 99.32f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.31f)
                        lineTo(153f, 237.66f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, 0f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(84f, 84f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                }.build()

        return _TagThin!!
    }

@Suppress("ObjectPropertyName")
private var _TagThin: ImageVector? = null
