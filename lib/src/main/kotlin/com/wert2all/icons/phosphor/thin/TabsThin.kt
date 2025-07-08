package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.TabsThin: ImageVector
    get() {
        if (_TabsThin != null) {
            return _TabsThin!!
        }
        _TabsThin =
            ImageVector
                .Builder(
                    name = "Thin.TabsThin",
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
                        moveTo(8f, 168f)
                        lineTo(30.29f, 93.7f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38f, 88f)
                        horizontalLineToRelative(84.1f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.66f, 5.7f)
                        lineTo(152f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 88f)
                        horizontalLineToRelative(10.05f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.66f, 5.7f)
                        lineTo(200f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 88f)
                        horizontalLineToRelative(10.05f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.66f, 5.7f)
                        lineTo(248f, 168f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(8f, 168f)
                        lineTo(248f, 168f)
                    }
                }.build()

        return _TabsThin!!
    }

@Suppress("ObjectPropertyName")
private var _TabsThin: ImageVector? = null
