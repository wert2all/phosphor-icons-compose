package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.BookOpenBold: ImageVector
    get() {
        if (_BookOpenBold != null) {
            return _BookOpenBold!!
        }
        _BookOpenBold =
            ImageVector
                .Builder(
                    name = "BookOpenBold",
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
                        moveTo(128f, 88f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                        horizontalLineToRelative(72f)
                        verticalLineTo(200f)
                        horizontalLineTo(160f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 200f)
                        horizontalLineTo(96f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
                        verticalLineTo(88f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 56f)
                        horizontalLineTo(24f)
                        close()
                    }
                }.build()

        return _BookOpenBold!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenBold: ImageVector? = null
