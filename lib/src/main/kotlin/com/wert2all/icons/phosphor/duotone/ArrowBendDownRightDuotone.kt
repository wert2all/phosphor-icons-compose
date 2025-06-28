package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowBendDownRightDuotone: ImageVector
    get() {
        if (_ArrowBendDownRightDuotone != null) {
            return _ArrowBendDownRightDuotone!!
        }
        _ArrowBendDownRightDuotone =
            ImageVector
                .Builder(
                    name = "ArrowBendDownRightDuotone",
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
                        moveTo(176f, 104f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(0f, -96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 104f)
                        lineToRelative(48f, 48f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(0f, -96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 56f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 96f)
                        horizontalLineToRelative(48f)
                    }
                }.build()

        return _ArrowBendDownRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendDownRightDuotone: ImageVector? = null
