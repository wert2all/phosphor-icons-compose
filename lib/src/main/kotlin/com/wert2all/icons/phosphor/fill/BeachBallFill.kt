package com.wert2all.icons.phosphor.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Fill.BeachBallFill: ImageVector
    get() {
        if (_BeachBallFill != null) {
            return _BeachBallFill!!
        }
        _BeachBallFill =
            ImageVector
                .Builder(
                    name = "Fill.BeachBallFill",
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
                        moveTo(211.44f, 100f)
                        arcTo(195.88f, 195.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 165f, 91f)
                        arcTo(195.88f, 195.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 44.56f)
                        arcTo(88.43f, 88.43f, 0f, isMoreThanHalf = false, isPositiveArc = true, 211.44f, 100f)
                        close()
                        moveTo(85f, 51.24f)
                        arcToRelative(188.27f, 188.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.3f, 39.21f)
                        arcTo(196.29f, 196.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.08f, 124.51f)
                        arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85f, 51.24f)
                        close()
                        moveTo(131.48f, 215.92f)
                        arcToRelative(
                            196.29f,
                            196.29f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            34.06f,
                            -112.23f,
                        )
                        arcTo(188.27f, 188.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204.76f, 171f)
                        arcTo(88.07f, 88.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 131.49f, 215.92f)
                        close()
                    }
                }.build()

        return _BeachBallFill!!
    }

@Suppress("ObjectPropertyName")
private var _BeachBallFill: ImageVector? = null
