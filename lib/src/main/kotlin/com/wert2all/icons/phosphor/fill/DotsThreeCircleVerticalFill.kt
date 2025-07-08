package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.DotsThreeCircleVerticalFill: ImageVector
    get() {
        if (_DotsThreeCircleVerticalFill != null) {
            return _DotsThreeCircleVerticalFill!!
        }
        _DotsThreeCircleVerticalFill =
            ImageVector
                .Builder(
                    name = "Fill.DotsThreeCircleVerticalFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(232f, 128f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 232f)
                        arcTo(104.13f, 104.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 128f)
                        close()
                        moveTo(116f, 84f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 84f)
                        close()
                        moveTo(116f, 128f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 128f)
                        close()
                        moveTo(116f, 172f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 12f)
                        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 172f)
                        close()
                    }
                }.build()

        return _DotsThreeCircleVerticalFill!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeCircleVerticalFill: ImageVector? = null
