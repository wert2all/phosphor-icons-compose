package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.StripeLogoThin: ImageVector
    get() {
        if (_StripeLogoThin != null) {
            return _StripeLogoThin!!
        }
        _StripeLogoThin =
            ImageVector
                .Builder(
                    name = "StripeLogoThin",
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
                        moveTo(96f, 152f)
                        curveToRelative(0f, 13.25f, 14.33f, 24f, 32f, 24f)
                        reflectiveCurveToRelative(32f, -10.75f, 32f, -24f)
                        curveToRelative(0f, -32f, -62.22f, -20f, -62.22f, -48f)
                        curveToRelative(0f, -13.25f, 12.55f, -24f, 30.22f, -24f)
                        curveToRelative(13.25f, 0f, 23.63f, 6f, 28f, 14.66f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(48f, 40f)
                        lineTo(208f, 40f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 48f)
                        lineTo(216f, 208f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 216f)
                        lineTo(48f, 216f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 208f)
                        lineTo(40f, 48f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 40f)
                        close()
                    }
                }.build()

        return _StripeLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _StripeLogoThin: ImageVector? = null
