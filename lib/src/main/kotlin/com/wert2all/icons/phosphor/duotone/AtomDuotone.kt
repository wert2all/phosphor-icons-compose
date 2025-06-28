package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.AtomDuotone: ImageVector
    get() {
        if (_AtomDuotone != null) {
            return _AtomDuotone!!
        }
        _AtomDuotone =
            ImageVector
                .Builder(
                    name = "AtomDuotone",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.2f,
                        strokeAlpha = 0.2f,
                    ) {
                        moveTo(96.79f, 159.2f)
                        arcToRelative(
                            116.33f,
                            44.13f,
                            45f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            62.41f,
                            -62.41f,
                        )
                        arcToRelative(
                            116.33f,
                            44.13f,
                            45f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            -62.41f,
                            62.41f,
                        )
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96.79f, 159.2f)
                        arcToRelative(
                            116.33f,
                            44.13f,
                            45f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            62.41f,
                            -62.41f,
                        )
                        arcToRelative(
                            116.33f,
                            44.13f,
                            45f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            -62.41f,
                            62.41f,
                        )
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(45.74f, 210.26f)
                        arcToRelative(
                            116.33f,
                            44.13f,
                            135f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            164.52f,
                            -164.52f,
                        )
                        arcToRelative(
                            116.33f,
                            44.13f,
                            135f,
                            isMoreThanHalf = true,
                            isPositiveArc = false,
                            -164.52f,
                            164.52f,
                        )
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(128f, 128f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _AtomDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _AtomDuotone: ImageVector? = null
