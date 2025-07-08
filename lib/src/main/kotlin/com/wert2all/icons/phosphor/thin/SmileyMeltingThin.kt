package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.SmileyMeltingThin: ImageVector
    get() {
        if (_SmileyMeltingThin != null) {
            return _SmileyMeltingThin!!
        }
        _SmileyMeltingThin =
            ImageVector
                .Builder(
                    name = "Thin.SmileyMeltingThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(164f, 140f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(116f, 92f)
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56.44f, 192f)
                        arcTo(95.67f, 95.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 126.06f)
                        curveTo(33f, 74.58f, 75.15f, 32.73f, 126.63f, 32f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72.93f, 160f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 240f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
                        horizontalLineToRelative(56f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
                        horizontalLineTo(136f)
                        curveToRelative(-26.51f, 0f, -56f, -21.49f, -56f, -48f)
                        arcToRelative(49f, 49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.66f, -8f)
                    }
                }.build()

        return _SmileyMeltingThin!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyMeltingThin: ImageVector? = null
