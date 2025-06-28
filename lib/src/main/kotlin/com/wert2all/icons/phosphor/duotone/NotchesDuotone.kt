package com.wert2all.icons.phosphor.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Duotone.NotchesDuotone: ImageVector
    get() {
        if (_NotchesDuotone != null) {
            return _NotchesDuotone!!
        }
        _NotchesDuotone =
            ImageVector
                .Builder(
                    name = "NotchesDuotone",
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
                        moveTo(192f, 192f)
                        lineToRelative(0f, -152f)
                        lineToRelative(-152f, 152f)
                        lineToRelative(152f, 0f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 16f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(192f, 192f)
                        lineToRelative(0f, -152f)
                        lineToRelative(-152f, 152f)
                        lineToRelative(152f, 0f)
                        close()
                    }
                }.build()

        return _NotchesDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _NotchesDuotone: ImageVector? = null
