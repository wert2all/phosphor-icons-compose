package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.ArrowULeftDownThin: ImageVector
    get() {
        if (_ArrowULeftDownThin != null) {
            return _ArrowULeftDownThin!!
        }
        _ArrowULeftDownThin =
            ImageVector
                .Builder(
                    name = "ArrowULeftDownThin",
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
                        moveTo(136f, 176f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 176f)
                        verticalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                        horizontalLineToRelative(0f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                        verticalLineTo(224f)
                    }
                }.build()

        return _ArrowULeftDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftDownThin: ImageVector? = null
