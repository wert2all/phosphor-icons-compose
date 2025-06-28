package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.StorefrontThin: ImageVector
    get() {
        if (_StorefrontThin != null) {
            return _StorefrontThin!!
        }
        _StorefrontThin =
            ImageVector
                .Builder(
                    name = "StorefrontThin",
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
                        moveTo(48f, 139.59f)
                        lineToRelative(0f, 76.41f)
                        lineToRelative(160f, 0f)
                        lineToRelative(0f, -76.41f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(54f, 40f)
                        horizontalLineTo(202f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.69f, 5.8f)
                        lineTo(224f, 96f)
                        horizontalLineTo(32f)
                        lineTo(46.34f, 45.8f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(96f, 96f)
                        verticalLineToRelative(16f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                        verticalLineTo(96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(160f, 96f)
                        verticalLineToRelative(16f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                        verticalLineTo(96f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(224f, 96f)
                        verticalLineToRelative(16f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 0f)
                        verticalLineTo(96f)
                    }
                }.build()

        return _StorefrontThin!!
    }

@Suppress("ObjectPropertyName")
private var _StorefrontThin: ImageVector? = null
