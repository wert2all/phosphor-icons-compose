package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.RedditLogoBold: ImageVector
    get() {
        if (_RedditLogoBold != null) {
            return _RedditLogoBold!!
        }
        _RedditLogoBold =
            ImageVector
                .Builder(
                    name = "RedditLogoBold",
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
                        moveTo(184f, 32f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(59.41f, 89.88f)
                        curveTo(77.72f, 78.75f, 101.72f, 72f, 128f, 72f)
                        reflectiveCurveToRelative(50.28f, 6.75f, 68.59f, 17.88f)
                        horizontalLineToRelative(0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 31.62f, 34.79f)
                        horizontalLineToRelative(0f)
                        arcTo(51.6f, 51.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 144f)
                        curveToRelative(0f, 39.76f, -46.56f, 72f, -104f, 72f)
                        reflectiveCurveTo(24f, 183.76f, 24f, 144f)
                        arcToRelative(51.6f, 51.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.79f, -19.33f)
                        horizontalLineToRelative(0f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 59.41f, 89.88f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(88f, 128f)
                        moveToRelative(-20f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(168f, 128f)
                        moveToRelative(-20f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(156f, 172f)
                        arcToRelative(100f, 100f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 72f)
                        lineToRelative(8f, -48f)
                        lineToRelative(36.16f, 6.03f)
                    }
                }.build()

        return _RedditLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _RedditLogoBold: ImageVector? = null
