package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ArrowBendRightDownDuotone: ImageVector
    get() {
        if (_ArrowBendRightDownDuotone != null) {
            return _ArrowBendRightDownDuotone!!
        }
        _ArrowBendRightDownDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ArrowBendRightDownDuotone",
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
                        moveTo(104f, 176f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 176f)
                        lineToRelative(48f, 48f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-96f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 32f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
                        verticalLineToRelative(48f)
                    }
                }.build()

        return _ArrowBendRightDownDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendRightDownDuotone: ImageVector? = null
