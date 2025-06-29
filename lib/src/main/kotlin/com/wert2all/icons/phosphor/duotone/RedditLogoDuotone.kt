package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.RedditLogoDuotone: ImageVector
    get() {
        if (_RedditLogoDuotone != null) {
            return _RedditLogoDuotone!!
        }
        _RedditLogoDuotone =
            ImageVector
                .Builder(
                    name = "RedditLogoDuotone",
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
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(184f, 32f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 72f)
                        lineToRelative(8f, -48f)
                        lineToRelative(32.29f, 4.97f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
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
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(168f, 128f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 176f)
                        arcToRelative(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                    }
                }.build()

        return _RedditLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _RedditLogoDuotone: ImageVector? = null
