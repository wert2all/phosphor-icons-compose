package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.BookOpenThin: ImageVector
    get() {
        if (_BookOpenThin != null) {
            return _BookOpenThin!!
        }
        _BookOpenThin =
            ImageVector
                .Builder(
                    name = "Thin.BookOpenThin",
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
                        moveTo(128f, 88f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
                        horizontalLineToRelative(72f)
                        verticalLineTo(200f)
                        horizontalLineTo(160f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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

        return _BookOpenThin!!
    }

@Suppress("ObjectPropertyName")
private var _BookOpenThin: ImageVector? = null
