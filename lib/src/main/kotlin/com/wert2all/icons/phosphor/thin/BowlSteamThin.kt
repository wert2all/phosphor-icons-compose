package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Thin.BowlSteamThin: ImageVector
    get() {
        if (_BowlSteamThin != null) {
            return _BowlSteamThin!!
        }
        _BowlSteamThin =
            ImageVector
                .Builder(
                    name = "Thin.BowlSteamThin",
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
                        moveTo(88f, 207.3f)
                        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 120f)
                        horizontalLineTo(224f)
                        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 87.3f)
                        verticalLineTo(216f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                        horizontalLineTo(96f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 88f)
                        reflectiveCurveToRelative(-18f, -5.6f, 0f, -28f)
                        reflectiveCurveToRelative(0f, -28f, 0f, -28f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 88f)
                        reflectiveCurveToRelative(-18f, -5.6f, 0f, -28f)
                        reflectiveCurveToRelative(0f, -28f, 0f, -28f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88f, 88f)
                        reflectiveCurveToRelative(-18f, -5.6f, 0f, -28f)
                        reflectiveCurveToRelative(0f, -28f, 0f, -28f)
                    }
                }.build()

        return _BowlSteamThin!!
    }

@Suppress("ObjectPropertyName")
private var _BowlSteamThin: ImageVector? = null
