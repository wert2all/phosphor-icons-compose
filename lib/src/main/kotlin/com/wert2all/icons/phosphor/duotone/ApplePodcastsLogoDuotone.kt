package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ApplePodcastsLogoDuotone: ImageVector
    get() {
        if (_ApplePodcastsLogoDuotone != null) {
            return _ApplePodcastsLogoDuotone!!
        }
        _ApplePodcastsLogoDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ApplePodcastsLogoDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(128f, 120f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(131.56f, 224f)
                        horizontalLineToRelative(-7.12f)
                        arcToRelative(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.76f, -12.12f)
                        lineToRelative(-12.19f, -48f)
                        arcTo(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112.25f, 144f)
                        horizontalLineToRelative(31.5f)
                        arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 19.88f)
                        lineToRelative(-12.19f, 48f)
                        arcTo(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.56f, 224f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 120f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(131.56f, 224f)
                        horizontalLineToRelative(-7.12f)
                        arcToRelative(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.76f, -12.12f)
                        lineToRelative(-12.19f, -48f)
                        arcTo(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112.25f, 144f)
                        horizontalLineToRelative(31.5f)
                        arcToRelative(16.06f, 16.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 19.88f)
                        lineToRelative(-12.19f, 48f)
                        arcTo(16.2f, 16.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.56f, 224f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(66.33f, 145.18f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 123.34f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(74.63f, 207.81f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 106.74f, 0f)
                    }
                }.build()

        return _ApplePodcastsLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ApplePodcastsLogoDuotone: ImageVector? = null
