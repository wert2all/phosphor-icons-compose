package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowULeftDownDuotone: ImageVector
    get() {
        if (_ArrowULeftDownDuotone != null) {
            return _ArrowULeftDownDuotone!!
        }
        _ArrowULeftDownDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowULeftDownDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(136f, 176f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(136f, 176f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 176f)
                        verticalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
                        horizontalLineToRelative(0f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 88f)
                        verticalLineToRelative(88f)
                    }
                }.build()

        return _ArrowULeftDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftDownDuotone: ImageVector? = null
