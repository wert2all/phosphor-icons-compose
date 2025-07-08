package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.RadioButtonFill: ImageVector
    get() {
        if (_RadioButtonFill != null) {
            return _RadioButtonFill!!
        }
        _RadioButtonFill =
            ImageVector
                .Builder(
                    name = "Fill.RadioButtonFill",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color.Black)) {
                        moveTo(128f, 24f)
                        arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                        arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                        close()
                        moveTo(128f, 216f)
                        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 88f, -88f)
                        arcTo(88.1f, 88.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 216f)
                        close()
                        moveTo(184f, 128f)
                        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, -56f)
                        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 128f)
                        close()
                    }
                }.build()

        return _RadioButtonFill!!
    }

@Suppress("ObjectPropertyName")
private var _RadioButtonFill: ImageVector? = null
