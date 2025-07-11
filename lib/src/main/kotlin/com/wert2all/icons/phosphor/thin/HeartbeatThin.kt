package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.HeartbeatThin: ImageVector
    get() {
        if (_HeartbeatThin != null) {
            return _HeartbeatThin!!
        }
        _HeartbeatThin =
            ImageVector
                .Builder(
                    name = "Thin.HeartbeatThin",
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
                        moveTo(32f, 136f)
                        lineToRelative(40f, 0f)
                        lineToRelative(16f, -24f)
                        lineToRelative(32f, 48f)
                        lineToRelative(16f, -24f)
                        lineToRelative(24f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(24f, 104f)
                        curveToRelative(0f, -0.67f, 0f, -1.33f, 0f, -2f)
                        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 48f)
                        curveToRelative(22.59f, 0f, 41.94f, 12.31f, 50f, 32f)
                        curveToRelative(8.06f, -19.69f, 27.41f, -32f, 50f, -32f)
                        arcToRelative(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 54f)
                        curveToRelative(0f, 66f, -104f, 122f, -104f, 122f)
                        reflectiveCurveToRelative(-42f, -22.6f, -72.58f, -56f)
                    }
                }.build()

        return _HeartbeatThin!!
    }

@Suppress("ObjectPropertyName")
private var _HeartbeatThin: ImageVector? = null
