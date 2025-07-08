package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Duotone.ListNumbersDuotone: ImageVector
    get() {
        if (_ListNumbersDuotone != null) {
            return _ListNumbersDuotone!!
        }
        _ListNumbersDuotone =
            ImageVector
                .Builder(
                    name = "Duotone.ListNumbersDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(104f, 64f)
                        horizontalLineToRelative(112f)
                        verticalLineToRelative(128f)
                        horizontalLineToRelative(-112f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 128f)
                        lineTo(216f, 128f)
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 64f)
                        lineTo(216f, 64f)
                    }
                    path(
                        fill = SolidColor(Color.Black),
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 192f)
                        lineTo(216f, 192f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(56f, 104f)
                        lineToRelative(0f, -64f)
                        lineToRelative(-16f, 8f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(72f, 208f)
                        horizontalLineTo(40f)
                        lineToRelative(28.68f, -38.37f)
                        arcToRelative(
                            15.69f,
                            15.69f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = false,
                            -3.24f,
                            -22.41f,
                        )
                        arcToRelative(16.78f, 16.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.06f, 3.15f)
                        arcToRelative(15.85f, 15.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.38f, 4.3f)
                    }
                }.build()

        return _ListNumbersDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ListNumbersDuotone: ImageVector? = null
