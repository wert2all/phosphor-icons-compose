package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowUUpRightThin: ImageVector
    get() {
        if (_ArrowUUpRightThin != null) {
            return _ArrowUUpRightThin!!
        }
        _ArrowUUpRightThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowUUpRightThin",
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
                        moveTo(176f, 136f)
                        lineToRelative(48f, -48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 200f)
                        horizontalLineTo(88f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, -56f)
                        horizontalLineToRelative(0f)
                        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 88f)
                        horizontalLineTo(224f)
                    }
                }.build()

        return _ArrowUUpRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUUpRightThin: ImageVector? = null
