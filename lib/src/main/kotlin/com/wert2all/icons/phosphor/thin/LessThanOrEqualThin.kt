package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.LessThanOrEqualThin: ImageVector
    get() {
        if (_LessThanOrEqualThin != null) {
            return _LessThanOrEqualThin!!
        }
        _LessThanOrEqualThin =
            ImageVector
                .Builder(
                    name = "Thin.LessThanOrEqualThin",
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
                        moveTo(200f, 48f)
                        lineToRelative(-152f, 56f)
                        lineToRelative(152f, 56f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 200f)
                        lineTo(48f, 200f)
                    }
                }.build()

        return _LessThanOrEqualThin!!
    }

@Suppress("ObjectPropertyName")
private var _LessThanOrEqualThin: ImageVector? = null
