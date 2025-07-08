package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.HexagonThin: ImageVector
    get() {
        if (_HexagonThin != null) {
            return _HexagonThin!!
        }
        _HexagonThin =
            ImageVector
                .Builder(
                    name = "Thin.HexagonThin",
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
                        moveTo(131.84f, 25f)
                        lineToRelative(88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, 7f)
                        verticalLineToRelative(95.64f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.16f, 7f)
                        lineToRelative(-88f, 48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.68f, 0f)
                        lineToRelative(-88f, -48.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.16f, -7f)
                        verticalLineTo(80.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.16f, -7f)
                        lineToRelative(88f, -48.18f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.84f, 25f)
                        close()
                    }
                }.build()

        return _HexagonThin!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonThin: ImageVector? = null
