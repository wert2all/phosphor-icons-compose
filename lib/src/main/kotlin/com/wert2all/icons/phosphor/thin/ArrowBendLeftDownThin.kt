package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.ArrowBendLeftDownThin: ImageVector
    get() {
        if (_ArrowBendLeftDownThin != null) {
            return _ArrowBendLeftDownThin!!
        }
        _ArrowBendLeftDownThin =
            ImageVector
                .Builder(
                    name = "Thin.ArrowBendLeftDownThin",
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
                        moveTo(152f, 176f)
                        lineToRelative(-48f, 48f)
                        lineToRelative(-48f, -48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(200f, 32f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 96f)
                        verticalLineToRelative(96f)
                    }
                }.build()

        return _ArrowBendLeftDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBendLeftDownThin: ImageVector? = null
