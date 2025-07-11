package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ChatsCircleThin: ImageVector
    get() {
        if (_ChatsCircleThin != null) {
            return _ChatsCircleThin!!
        }
        _ChatsCircleThin =
            ImageVector
                .Builder(
                    name = "Thin.ChatsCircleThin",
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
                        moveTo(32.5f, 138f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 62f, 167.5f)
                        lineToRelative(-27.76f, 8.16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, -9.93f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(163.94f, 80.11f)
                        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.5f, 186f)
                        lineToRelative(8.16f, 27.76f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.93f, 9.93f)
                        lineTo(194f, 215.5f)
                        arcTo(72.05f, 72.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.06f, 175.89f)
                    }
                }.build()

        return _ChatsCircleThin!!
    }

@Suppress("ObjectPropertyName")
private var _ChatsCircleThin: ImageVector? = null
