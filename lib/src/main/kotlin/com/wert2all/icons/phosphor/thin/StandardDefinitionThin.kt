package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.StandardDefinitionThin: ImageVector
    get() {
        if (_StandardDefinitionThin != null) {
            return _StandardDefinitionThin!!
        }
        _StandardDefinitionThin =
            ImageVector
                .Builder(
                    name = "StandardDefinitionThin",
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
                        moveTo(144f, 176f)
                        horizontalLineToRelative(24f)
                        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -96f)
                        horizontalLineTo(144f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 48f)
                        lineTo(224f, 48f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 208f)
                        lineTo(224f, 208f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 152f)
                        curveToRelative(0f, 13.25f, 14.33f, 24f, 32f, 24f)
                        reflectiveCurveToRelative(32f, -10.75f, 32f, -24f)
                        curveToRelative(0f, -32f, -62.22f, -20f, -62.22f, -48f)
                        curveToRelative(0f, -13.25f, 12.55f, -24f, 30.22f, -24f)
                        curveToRelative(13.25f, 0f, 23.63f, 6f, 28f, 14.66f)
                    }
                }.build()

        return _StandardDefinitionThin!!
    }

@Suppress("ObjectPropertyName")
private var _StandardDefinitionThin: ImageVector? = null
