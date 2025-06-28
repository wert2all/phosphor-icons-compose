package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.CricketThin: ImageVector
    get() {
        if (_CricketThin != null) {
            return _CricketThin!!
        }
        _CricketThin =
            ImageVector
                .Builder(
                    name = "CricketThin",
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
                        moveTo(66.35f, 141.66f)
                        lineTo(173.66f, 34.35f)
                        arcTo(8f, 8f, 119.58f, isMoreThanHalf = false, isPositiveArc = true, 184.98f, 34.35f)
                        lineTo(237.66f, 87.04f)
                        arcTo(8f, 8f, 93.56f, isMoreThanHalf = false, isPositiveArc = true, 237.66f, 98.35f)
                        lineTo(130.35f, 205.66f)
                        arcTo(8f, 8f, 107.99f, isMoreThanHalf = false, isPositiveArc = true, 119.04f, 205.66f)
                        lineTo(66.35f, 152.97f)
                        arcTo(8f, 8f, 119.05f, isMoreThanHalf = false, isPositiveArc = true, 66.35f, 141.66f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 144f)
                        lineTo(40f, 232f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(104f, 104f)
                        lineToRelative(64f, 0f)
                        lineToRelative(0f, 64f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(60f, 60f)
                        moveToRelative(-20f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
                    }
                }.build()

        return _CricketThin!!
    }

@Suppress("ObjectPropertyName")
private var _CricketThin: ImageVector? = null
