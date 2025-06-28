package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.ArchiveFill: ImageVector
    get() {
        if (_ArchiveFill != null) {
            return _ArchiveFill!!
        }
        _ArchiveFill =
            ImageVector
                .Builder(
                    name = "ArchiveFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 48f)
                        lineTo(32f, 48f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
                        lineTo(16f, 88f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        verticalLineToRelative(88f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                        lineTo(208f, 208f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(224f, 104f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                        lineTo(240f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 48f)
                        close()
                        moveTo(152f, 144f)
                        lineTo(104f, 144f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                        horizontalLineToRelative(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        close()
                        moveTo(224f, 88f)
                        lineTo(32f, 88f)
                        lineTo(32f, 64f)
                        lineTo(224f, 64f)
                        lineTo(224f, 88f)
                        close()
                    }
                }.build()

        return _ArchiveFill!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveFill: ImageVector? = null
