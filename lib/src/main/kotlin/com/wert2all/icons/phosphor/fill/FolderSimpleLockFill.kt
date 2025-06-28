package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Fill.FolderSimpleLockFill: ImageVector
    get() {
        if (_FolderSimpleLockFill != null) {
            return _FolderSimpleLockFill!!
        }
        _FolderSimpleLockFill =
            ImageVector
                .Builder(
                    name = "FolderSimpleLockFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(224f, 160f)
                        horizontalLineToRelative(-8f)
                        verticalLineToRelative(-4f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 0f)
                        verticalLineToRelative(4f)
                        horizontalLineToRelative(-8f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                        verticalLineToRelative(40f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                        horizontalLineToRelative(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                        lineTo(232f, 168f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 160f)
                        close()
                        moveTo(200f, 160f)
                        lineTo(176f, 160f)
                        verticalLineToRelative(-4f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 0f)
                        close()
                        moveTo(232f, 88f)
                        verticalLineToRelative(16f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                        lineTo(216f, 88f)
                        lineTo(130.67f, 88f)
                        arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.6f, -3.2f)
                        lineTo(93.33f, 64f)
                        lineTo(40f, 64f)
                        lineTo(40f, 200f)
                        horizontalLineToRelative(72f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                        lineTo(40f, 216f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                        lineTo(24f, 64f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                        lineTo(93.33f, 48f)
                        arcToRelative(16.12f, 16.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 3.2f)
                        lineTo(130.67f, 72f)
                        lineTo(216f, 72f)
                        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 88f)
                        close()
                    }
                }.build()

        return _FolderSimpleLockFill!!
    }

@Suppress("ObjectPropertyName")
private var _FolderSimpleLockFill: ImageVector? = null
