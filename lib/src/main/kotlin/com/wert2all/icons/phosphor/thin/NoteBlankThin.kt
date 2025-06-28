package com.wert2all.icons.phosphor.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Thin.NoteBlankThin: ImageVector
    get() {
        if (_NoteBlankThin != null) {
            return _NoteBlankThin!!
        }
        _NoteBlankThin =
            ImageVector
                .Builder(
                    name = "NoteBlankThin",
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
                        moveTo(156.69f, 216f)
                        horizontalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                        verticalLineTo(48f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                        horizontalLineTo(208f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                        verticalLineTo(156.69f)
                        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.34f, 5.65f)
                        lineToRelative(-51.32f, 51.32f)
                        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156.69f, 216f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 8f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(215.28f, 159.99f)
                        lineToRelative(-55.28f, 0f)
                        lineToRelative(0f, 55.28f)
                    }
                }.build()

        return _NoteBlankThin!!
    }

@Suppress("ObjectPropertyName")
private var _NoteBlankThin: ImageVector? = null
