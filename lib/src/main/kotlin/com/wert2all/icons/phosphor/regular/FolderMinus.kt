package com.wert2all.icons.phosphor.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Regular.FolderMinus: ImageVector
    get() {
        if (_FolderMinus != null) {
            return _FolderMinus!!
        }
        _FolderMinus =
            ImageVector
                .Builder(
                    name = "Regular.FolderMinus",
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
                        moveTo(216.89f, 208f)
                        horizontalLineTo(39.38f)
                        arcTo(7.4f, 7.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200.62f)
                        verticalLineTo(80f)
                        horizontalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(200.89f)
                        arcTo(7.11f, 7.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216.89f, 208f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32f, 80f)
                        verticalLineTo(56f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(92.69f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.65f, 2.34f)
                        lineTo(128f, 80f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 144f)
                        lineTo(152f, 144f)
                    }
                }.build()

        return _FolderMinus!!
    }

@Suppress("ObjectPropertyName")
private var _FolderMinus: ImageVector? = null
