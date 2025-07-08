package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TextBThin: ImageVector
    get() {
        if (_TextBThin != null) {
            return _TextBThin!!
        }
        _TextBThin =
            ImageVector
                .Builder(
                    name = "Thin.TextBThin",
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
                        moveTo(80f, 120f)
                        horizontalLineToRelative(80f)
                        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 80f)
                        horizontalLineTo(80f)
                        verticalLineTo(48f)
                        horizontalLineToRelative(68f)
                        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 72f)
                    }
                }.build()

        return _TextBThin!!
    }

@Suppress("ObjectPropertyName")
private var _TextBThin: ImageVector? = null
