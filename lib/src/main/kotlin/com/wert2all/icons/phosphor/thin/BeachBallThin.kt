package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.BeachBallThin: ImageVector
    get() {
        if (_BeachBallThin != null) {
            return _BeachBallThin!!
        }
        _BeachBallThin =
            ImageVector
                .Builder(
                    name = "BeachBallThin",
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
                        moveTo(128f, 128f)
                        moveToRelative(-96f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(147.93f, 34.08f)
                        arcToRelative(
                            192.17f,
                            192.17f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            -27.12f,
                            189.65f,
                        )
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(32.27f, 135.19f)
                        arcToRelative(
                            192.17f,
                            192.17f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            189.65f,
                            -27.12f,
                        )
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(79.25f, 45.27f)
                        arcToRelative(
                            191.14f,
                            191.14f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            82.69f,
                            48.79f,
                        )
                        arcToRelative(
                            191.14f,
                            191.14f,
                            0f,
                            isMoreThanHalf = false,
                            isPositiveArc = true,
                            48.79f,
                            82.69f,
                        )
                    }
                }.build()

        return _BeachBallThin!!
    }

@Suppress("ObjectPropertyName")
private var _BeachBallThin: ImageVector? = null
