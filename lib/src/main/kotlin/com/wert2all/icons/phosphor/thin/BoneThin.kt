package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.BoneThin: ImageVector
    get() {
        if (_BoneThin != null) {
            return _BoneThin!!
        }
        _BoneThin =
            ImageVector
                .Builder(
                    name = "Thin.BoneThin",
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
                        moveTo(56.32f, 199.68f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.51f, -51.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, -1.07f)
                        lineToRelative(70.38f, -70.38f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.07f, -10f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 51.42f, -10.51f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -10.51f, 51.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10f, 1.07f)
                        lineToRelative(-70.38f, 70.38f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.07f, 10f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -51.42f, 10.51f)
                        close()
                    }
                }.build()

        return _BoneThin!!
    }

@Suppress("ObjectPropertyName")
private var _BoneThin: ImageVector? = null
