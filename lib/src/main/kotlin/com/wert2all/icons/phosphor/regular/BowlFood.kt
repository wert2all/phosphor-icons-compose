package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.BowlFood: ImageVector
    get() {
        if (_BowlFood != null) {
            return _BowlFood!!
        }
        _BowlFood =
            ImageVector
                .Builder(
                    name = "Regular.BowlFood",
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
                        moveTo(48f, 112f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(89.6f, 112f)
                        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 48f)
                        arcToRelative(81.61f, 81.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.61f, 0.46f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(134.66f, 112f)
                        arcTo(80.13f, 80.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 193f, 65.4f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 199.3f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 112f)
                        horizontalLineTo(224f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 87.3f)
                        verticalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        close()
                    }
                }.build()

        return _BowlFood!!
    }

@Suppress("ObjectPropertyName")
private var _BowlFood: ImageVector? = null
