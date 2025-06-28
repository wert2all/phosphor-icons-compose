package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.SmileyStickerDuotone: ImageVector
    get() {
        if (_SmileyStickerDuotone != null) {
            return _SmileyStickerDuotone!!
        }
        _SmileyStickerDuotone =
            ImageVector
                .Builder(
                    name = "SmileyStickerDuotone",
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
                        moveTo(156.22f, 219.79f)
                        arcToRelative(95.9f, 95.9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.57f, -63.58f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 152f)
                        curveToRelative(-8.3f, 14.35f, -22.23f, 24f, -40f, 24f)
                        reflectiveCurveToRelative(-31.7f, -9.65f, -40f, -24f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(156.22f, 219.79f)
                        arcToRelative(95.9f, 95.9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 63.57f, -63.58f)
                        close()
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(92f, 108f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(164f, 108f)
                        moveToRelative(-12f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                        arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
                    }
                }.build()

        return _SmileyStickerDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SmileyStickerDuotone: ImageVector? = null
