package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.NotificationThin: ImageVector
    get() {
        if (_NotificationThin != null) {
            return _NotificationThin!!
        }
        _NotificationThin =
            ImageVector
                .Builder(
                    name = "NotificationThin",
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
                        moveTo(208f, 128f)
                        verticalLineToRelative(80f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineToRelative(80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(196f, 60f)
                        moveToRelative(-28f, 0f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, 0f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, 0f)
                    }
                }.build()

        return _NotificationThin!!
    }

@Suppress("ObjectPropertyName")
private var _NotificationThin: ImageVector? = null
