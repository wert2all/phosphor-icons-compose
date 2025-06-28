package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.GitCommitFill: ImageVector
    get() {
        if (_GitCommitFill != null) {
            return _GitCommitFill!!
        }
        _GitCommitFill =
            ImageVector
                .Builder(
                    name = "GitCommitFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(256f, 128f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(183.42f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -110.84f, 0f)
                        horizontalLineTo(8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineTo(72.58f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.84f, 0f)
                        horizontalLineTo(248f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 128f)
                        close()
                    }
                }.build()

        return _GitCommitFill!!
    }

@Suppress("ObjectPropertyName")
private var _GitCommitFill: ImageVector? = null
