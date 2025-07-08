package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Light.QuestionMarkLight: ImageVector
    get() {
        if (_QuestionMarkLight != null) {
            return _QuestionMarkLight!!
        }
        _QuestionMarkLight =
            ImageVector
                .Builder(
                    name = "Light.QuestionMarkLight",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 160f)
                        verticalLineTo(144f)
                        curveToRelative(30.93f, 0f, 56f, -21.49f, 56f, -48f)
                        reflectiveCurveToRelative(-25.07f, -48f, -56f, -48f)
                        reflectiveCurveTo(72f, 69.49f, 72f, 96f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 208f)
                        moveToRelative(-14f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 0f)
                        arcToRelative(14f, 14f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, 0f)
                    }
                }.build()

        return _QuestionMarkLight!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMarkLight: ImageVector? = null
