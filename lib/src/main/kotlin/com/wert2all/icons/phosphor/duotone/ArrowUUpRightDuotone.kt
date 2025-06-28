package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.ArrowUUpRightDuotone: ImageVector
    get() {
        if (_ArrowUUpRightDuotone != null) {
            return _ArrowUUpRightDuotone!!
        }
        _ArrowUUpRightDuotone =
            ImageVector
                .Builder(
                    name = "ArrowUUpRightDuotone",
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
                        moveTo(176f, 136f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(0f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 136f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(0f, 96f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 200f)
                        horizontalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                        horizontalLineToRelative(0f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 88f)
                        horizontalLineToRelative(88f)
                    }
                }.build()

        return _ArrowUUpRightDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpRightDuotone: ImageVector? = null
