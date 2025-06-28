package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Regular.PaperPlaneTilt: ImageVector
    get() {
        if (_PaperPlaneTilt != null) {
            return _PaperPlaneTilt!!
        }
        _PaperPlaneTilt =
            ImageVector
                .Builder(
                    name = "PaperPlaneTilt",
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
                        moveTo(108f, 148f)
                        lineTo(160f, 96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(223.69f, 42.18f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.87f, -9.87f)
                        lineToRelative(-192f, 58.22f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.25f, 14.93f)
                        lineTo(108f, 148f)
                        lineToRelative(42.54f, 87.42f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.93f, -1.25f)
                        close()
                    }
                }.build()

        return _PaperPlaneTilt!!
    }

@Suppress("ObjectPropertyName")
private var _PaperPlaneTilt: ImageVector? = null
