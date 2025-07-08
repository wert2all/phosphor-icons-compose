package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.ArrowBendDownRightLight: ImageVector
    get() {
        if (_ArrowBendDownRightLight != null) {
            return _ArrowBendDownRightLight!!
        }
        _ArrowBendDownRightLight =
            ImageVector
                .Builder(
                    name = "Light.ArrowBendDownRightLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 104f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 56f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
                        horizontalLineToRelative(96f)
                    }
                }.build()

        return _ArrowBendDownRightLight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDownRightLight: ImageVector? = null
