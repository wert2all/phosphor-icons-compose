package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.FolderStarLight: ImageVector
    get() {
        if (_FolderStarLight != null) {
            return _FolderStarLight!!
        }
        _FolderStarLight =
            ImageVector
                .Builder(
                    name = "Light.FolderStarLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 80f)
                        verticalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(92.69f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                        lineTo(128f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(120.56f, 208f)
                        horizontalLineTo(39.38f)
                        arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200.62f)
                        verticalLineTo(80f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineToRelative(32f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
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

        return _FolderStarLight!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStarLight: ImageVector? = null
