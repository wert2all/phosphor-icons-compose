package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.WalletBold: ImageVector
    get() {
        if (_WalletBold != null) {
            return _WalletBold!!
        }
        _WalletBold =
            ImageVector
                .Builder(
                    name = "WalletBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(180f, 136f)
                        moveToRelative(-16f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(40f, 60.73f)
                        verticalLineTo(180f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                        horizontalLineTo(204f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, -20f)
                        verticalLineTo(100f)
                        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, -20f)
                        horizontalLineTo(60.48f)
                        curveTo(49.63f, 80f, 40.4f, 71.57f, 40f, 60.73f)
                        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 40f)
                        horizontalLineTo(192f)
                    }
                }.build()

        return _WalletBold!!
    }

@Suppress("ObjectPropertyName")
private var _WalletBold: ImageVector? = null
