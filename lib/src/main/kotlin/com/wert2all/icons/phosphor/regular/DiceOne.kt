package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.DiceOne: ImageVector
    get() {
        if (_DiceOne != null) {
            return _DiceOne!!
        }
        _DiceOne =
            ImageVector
                .Builder(
                    name = "Regular.DiceOne",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
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
                        moveTo(128f, 128f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _DiceOne!!
    }

@Suppress("ObjectPropertyName")
private var _DiceOne: ImageVector? = null
