package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.ArchiveBold: ImageVector
    get() {
        if (_ArchiveBold != null) {
            return _ArchiveBold!!
        }
        _ArchiveBold =
            ImageVector
                .Builder(
                    name = "ArchiveBold",
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
                        moveTo(32f, 56f)
                        lineTo(224f, 56f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 64f)
                        lineTo(232f, 88f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 96f)
                        lineTo(32f, 96f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 88f)
                        lineTo(24f, 64f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 56f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(216f, 96f)
                        verticalLineToRelative(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 136f)
                        lineTo(152f, 136f)
                    }
                }.build()

        return _ArchiveBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveBold: ImageVector? = null
