package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DotsThreeOutlineVerticalFill: ImageVector
    get() {
        if (_DotsThreeOutlineVerticalFill != null) {
            return _DotsThreeOutlineVerticalFill!!
        }
        _DotsThreeOutlineVerticalFill =
            ImageVector
                .Builder(
                    name = "Fill.DotsThreeOutlineVerticalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(156f, 128f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -28f, -28f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 128f)
                        close()
                        moveTo(128f, 76f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28f, -28f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 76f)
                        close()
                        moveTo(128f, 180f)
                        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 28f, 28f)
                        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 180f)
                        close()
                    }
                }.build()

        return _DotsThreeOutlineVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeOutlineVerticalFill: ImageVector? = null
