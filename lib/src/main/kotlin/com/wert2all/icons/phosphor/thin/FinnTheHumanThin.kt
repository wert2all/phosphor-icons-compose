package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.FinnTheHumanThin: ImageVector
    get() {
        if (_FinnTheHumanThin != null) {
            return _FinnTheHumanThin!!
        }
        _FinnTheHumanThin =
            ImageVector
                .Builder(
                    name = "FinnTheHumanThin",
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
                        moveTo(88f, 112f)
                        lineTo(168f, 112f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 200f, 144f)
                        lineTo(200f, 152f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 184f)
                        lineTo(88f, 184f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 152f)
                        lineTo(56f, 144f)
                        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 112f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 72f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                        horizontalLineTo(184f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
                        verticalLineToRelative(80f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
                        horizontalLineTo(88f)
                        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, -64f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(92f, 148f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(164f, 148f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                }.build()

        return _FinnTheHumanThin!!
    }

@Suppress("ObjectPropertyName")
private var _FinnTheHumanThin: ImageVector? = null
