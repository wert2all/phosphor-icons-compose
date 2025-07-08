package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.TidalLogoBold: ImageVector
    get() {
        if (_TidalLogoBold != null) {
            return _TidalLogoBold!!
        }
        _TidalLogoBold =
            ImageVector
                .Builder(
                    name = "Bold.TidalLogoBold",
                    defaultWidth = 256.dp,
                    defaultHeight = 256.dp,
                    viewportWidth = 256f,
                    viewportHeight = 256f,
                ).apply {
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(12f, 96f)
                        lineToRelative(38f, -38f)
                        lineToRelative(38f, 38f)
                        lineToRelative(-38f, 38f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 96f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(88.01f, 176f)
                        lineToRelative(40f, -40f)
                        lineToRelative(40f, 40f)
                        lineToRelative(-40f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 96f)
                        lineToRelative(38f, -38f)
                        lineToRelative(38f, 38f)
                        lineToRelative(-38f, 38f)
                        close()
                    }
                }.build()

        return _TidalLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _TidalLogoBold: ImageVector? = null
