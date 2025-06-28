package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bold.PawPrintBold: ImageVector
    get() {
        if (_PawPrintBold != null) {
            return _PawPrintBold!!
        }
        _PawPrintBold =
            ImageVector
                .Builder(
                    name = "PawPrintBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(212f, 108f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(44f, 108f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(92f, 60f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(fill = SolidColor(Color(0xFF000000))) {
                        moveTo(164f, 60f)
                        moveToRelative(-24f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
                        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(128f, 104f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 93.43f, 130f)
                        arcToRelative(43.49f, 43.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -20.67f, 25.9f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.73f, 57.62f)
                        arcToRelative(72.49f, 72.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 55f, 0f)
                        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.73f, -57.62f)
                        arcTo(43.46f, 43.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 162.57f, 130f)
                        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 104f)
                        close()
                    }
                }.build()

        return _PawPrintBold!!
    }

@Suppress("ObjectPropertyName")
private var _PawPrintBold: ImageVector? = null
