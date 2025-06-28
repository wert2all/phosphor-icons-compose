package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.AtomThin: ImageVector
    get() {
        if (_AtomThin != null) {
            return _AtomThin!!
        }
        _AtomThin =
            ImageVector
                .Builder(
                    name = "AtomThin",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
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
                        strokeLineWidth = 8f,
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
                        moveToRelative(-8f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                    }
                }.build()

        return _AtomThin!!
    }

@Suppress("ObjectPropertyName")
private var _AtomThin: ImageVector? = null
