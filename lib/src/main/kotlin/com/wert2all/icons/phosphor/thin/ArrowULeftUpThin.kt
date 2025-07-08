package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowULeftUpThin: ImageVector
    get() {
        if (_ArrowULeftUpThin != null) {
            return _ArrowULeftUpThin!!
        }
        _ArrowULeftUpThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowULeftUpThin",
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
                        moveTo(136f, 80f)
                        lineToRelative(-48f, -48f)
                        lineToRelative(-48f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 80f)
                        verticalLineToRelative(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
                        horizontalLineToRelative(0f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                        verticalLineTo(32f)
                    }
                }.build()

        return _ArrowULeftUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowULeftUpThin: ImageVector? = null
