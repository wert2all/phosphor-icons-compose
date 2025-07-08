package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.QuestionMark: ImageVector
    get() {
        if (_QuestionMark != null) {
            return _QuestionMark!!
        }
        _QuestionMark =
            ImageVector
                .Builder(
                    name = "Regular.QuestionMark",
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
                        moveTo(128f, 160f)
                        verticalLineTo(144f)
                        curveToRelative(30.93f, 0f, 56f, -21.49f, 56f, -48f)
                        reflectiveCurveToRelative(-25.07f, -48f, -56f, -48f)
                        reflectiveCurveTo(72f, 69.49f, 72f, 96f)
                    }
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 208f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                }.build()

        return _QuestionMark!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionMark: ImageVector? = null
