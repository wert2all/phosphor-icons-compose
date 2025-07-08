package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.DiceThreeDuotone: ImageVector
    get() {
        if (_DiceThreeDuotone != null) {
            return _DiceThreeDuotone!!
        }
        _DiceThreeDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.DiceThreeDuotone",
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
                        moveTo(64f, 40f)
                        lineTo(192f, 40f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                        lineTo(216f, 192f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                        lineTo(64f, 216f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        lineTo(40f, 64f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 40f)
                        lineTo(192f, 40f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 64f)
                        lineTo(216f, 192f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 216f)
                        lineTo(64f, 216f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                        lineTo(40f, 64f)
                        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 40f)
                        close()
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(92f, 92f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 128f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(164f, 164f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _DiceThreeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DiceThreeDuotone: ImageVector? = null
