package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.UsersThin: ImageVector
    get() {
        if (_UsersThin != null) {
            return _UsersThin!!
        }
        _UsersThin =
            ImageVector
                .Builder(
                    name = "UsersThin",
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
                        moveTo(10.23f, 200f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 147.54f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(172f, 160f)
                        arcToRelative(87.93f, 87.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 73.77f, 40f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(84f, 108f)
                        moveToRelative(-52f, 0f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 104f, 0f)
                        arcToRelative(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, -104f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152.69f, 59.7f)
                        arcTo(52f, 52f, 0f, isMoreThanHalf = true, isPositiveArc = true, 172f, 160f)
                    }
                }.build()

        return _UsersThin!!
    }

@Suppress("ObjectPropertyName")
private var _UsersThin: ImageVector? = null
