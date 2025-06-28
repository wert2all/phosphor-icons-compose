package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.FolderSimpleStarDuotone: ImageVector
    get() {
        if (_FolderSimpleStarDuotone != null) {
            return _FolderSimpleStarDuotone!!
        }
        _FolderSimpleStarDuotone =
            ImageVector
                .Builder(
                    name = "FolderSimpleStarDuotone",
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
                        moveTo(184f, 198.54f)
                        lineToRelative(29.67f, 17.46f)
                        lineToRelative(-8.07f, -32.59f)
                        lineToRelative(26.4f, -21.8f)
                        lineToRelative(-34.65f, -2.67f)
                        lineToRelative(-13.35f, -30.94f)
                        lineToRelative(-13.35f, 30.94f)
                        lineToRelative(-34.65f, 2.67f)
                        lineToRelative(26.4f, 21.8f)
                        lineToRelative(-8.07f, 32.59f)
                        lineToRelative(29.67f, -17.46f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120f, 208f)
                        horizontalLineTo(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(93.33f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 1.6f)
                        lineTo(128f, 80f)
                        horizontalLineToRelative(88f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 198.54f)
                        lineToRelative(29.67f, 17.46f)
                        lineToRelative(-8.07f, -32.59f)
                        lineToRelative(26.4f, -21.8f)
                        lineToRelative(-34.65f, -2.67f)
                        lineToRelative(-13.35f, -30.94f)
                        lineToRelative(-13.35f, 30.94f)
                        lineToRelative(-34.65f, 2.67f)
                        lineToRelative(26.4f, 21.8f)
                        lineToRelative(-8.07f, 32.59f)
                        lineToRelative(29.67f, -17.46f)
                        close()
                    }
                }.build()

        return _FolderSimpleStarDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleStarDuotone: ImageVector? = null
