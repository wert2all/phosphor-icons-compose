package com.wert2all.icons.phosphor.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Light.TreeStructureLight: ImageVector
    get() {
        if (_TreeStructureLight != null) {
            return _TreeStructureLight!!
        }
        _TreeStructureLight =
            ImageVector
                .Builder(
                    name = "TreeStructureLight",
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
                        moveTo(24f, 104f)
                        lineTo(56f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 112f)
                        lineTo(64f, 144f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 152f)
                        lineTo(24f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 144f)
                        lineTo(16f, 112f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 104f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 40f)
                        lineTo(208f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        lineTo(216f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 104f)
                        lineTo(160f, 104f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 96f)
                        lineTo(152f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 152f)
                        lineTo(208f, 152f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 160f)
                        lineTo(216f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                        lineTo(160f, 216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 208f)
                        lineTo(152f, 160f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 152f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(64f, 128f)
                        lineTo(112f, 128f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 12f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(152f, 184f)
                        horizontalLineTo(128f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        verticalLineTo(88f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
                        horizontalLineToRelative(24f)
                    }
                }.build()

        return _TreeStructureLight!!
    }

@Suppress("ObjectPropertyName")
private var _TreeStructureLight: ImageVector? = null
