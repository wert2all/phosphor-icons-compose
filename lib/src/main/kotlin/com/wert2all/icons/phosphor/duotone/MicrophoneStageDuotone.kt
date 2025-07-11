package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.MicrophoneStageDuotone: ImageVector
    get() {
        if (_MicrophoneStageDuotone != null) {
            return _MicrophoneStageDuotone!!
        }
        _MicrophoneStageDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.MicrophoneStageDuotone",
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
                        moveTo(105.05f, 99.52f)
                        lineToRelative(0f, 0f)
                        lineTo(33.55f, 197f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, 10.38f)
                        lineToRelative(14.3f, 14.3f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.38f, 0.79f)
                        lineTo(156.5f, 151f)
                        lineToRelative(0f, 0f)
                        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 105.05f, 99.52f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 88f)
                        moveToRelative(-64f, 0f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(213.25f, 133.25f)
                        lineTo(122.75f, 42.75f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 160f)
                        lineTo(104f, 152f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(105f, 99.5f)
                        lineTo(33.55f, 197f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.79f, 10.38f)
                        lineToRelative(14.3f, 14.3f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.38f, 0.79f)
                        lineTo(156.5f, 151f)
                    }
                }.build()

        return _MicrophoneStageDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _MicrophoneStageDuotone: ImageVector? = null
