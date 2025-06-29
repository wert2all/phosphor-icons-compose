package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArrowBendRightDownBold: ImageVector
    get() {
        if (_ArrowBendRightDownBold != null) {
            return _ArrowBendRightDownBold!!
        }
        _ArrowBendRightDownBold =
            ImageVector
                .Builder(
                    name = "ArrowBendRightDownBold",
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
                        moveTo(104f, 176f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 32f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
                        verticalLineToRelative(96f)
                    }
                }.build()

        return _ArrowBendRightDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendRightDownBold: ImageVector? = null
