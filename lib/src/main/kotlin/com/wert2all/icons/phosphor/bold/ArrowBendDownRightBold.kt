package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowBendDownRightBold: ImageVector
    get() {
        if (_ArrowBendDownRightBold != null) {
            return _ArrowBendDownRightBold!!
        }
        _ArrowBendDownRightBold =
            ImageVector
                .Builder(
                    name = "ArrowBendDownRightBold",
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
                        moveTo(176f, 104f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 56f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
                        horizontalLineToRelative(96f)
                    }
                }.build()

        return _ArrowBendDownRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDownRightBold: ImageVector? = null
