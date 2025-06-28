package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.BracketsCurly: ImageVector
    get() {
        if (_BracketsCurly != null) {
            return _BracketsCurly!!
        }
        _BracketsCurly =
            ImageVector
                .Builder(
                    name = "BracketsCurly",
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
                        moveTo(80f, 40f)
                        curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                        curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(176f, 40f)
                        curveToRelative(64f, 0f, 0f, 88f, 64f, 88f)
                        curveToRelative(-64f, 0f, 0f, 88f, -64f, 88f)
                    }
                }.build()

        return _BracketsCurly!!
    }

@Suppress("ObjectPropertyName")
private var _BracketsCurly: ImageVector? = null
