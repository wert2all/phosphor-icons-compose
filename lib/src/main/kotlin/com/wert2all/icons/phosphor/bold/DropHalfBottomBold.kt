package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.DropHalfBottomBold: ImageVector
    get() {
        if (_DropHalfBottomBold != null) {
            return _DropHalfBottomBold!!
        }
        _DropHalfBottomBold =
            ImageVector
                .Builder(
                    name = "DropHalfBottomBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(208f, 144f)
                        curveToRelative(0f, -72f, -80f, -128f, -80f, -128f)
                        reflectiveCurveTo(48f, 72f, 48f, 144f)
                        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56.54f, 180f)
                        lineTo(199.46f, 180f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48.08f, 140f)
                        lineTo(207.92f, 140f)
                    }
                }.build()

        return _DropHalfBottomBold!!
    }

@Suppress("ObjectPropertyName")
private var _DropHalfBottomBold: ImageVector? = null
