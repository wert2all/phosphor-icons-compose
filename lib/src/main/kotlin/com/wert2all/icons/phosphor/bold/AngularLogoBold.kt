package com.wert2all.icons.phosphor.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.wert2all.icons.phosphor.Phosphor

val Phosphor.Bold.AngularLogoBold: ImageVector
    get() {
        if (_AngularLogoBold != null) {
            return _AngularLogoBold!!
        }
        _AngularLogoBold =
            ImageVector
                .Builder(
                    name = "Bold.AngularLogoBold",
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
                        moveTo(128f, 232f)
                        lineToRelative(80f, -40f)
                        lineToRelative(16f, -120f)
                        lineToRelative(-96f, -40f)
                        lineToRelative(-96f, 40f)
                        lineToRelative(16f, 120f)
                        lineToRelative(80f, 40f)
                        close()
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(168f, 160f)
                        lineToRelative(-40f, -72f)
                        lineToRelative(-40f, 72f)
                    }
                    path(
                        stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 24f,
                        strokeLineCap = StrokeCap.Round,
                        strokeLineJoin = StrokeJoin.Round,
                    ) {
                        moveTo(99.11f, 140f)
                        lineTo(156.89f, 140f)
                    }
                }.build()

        return _AngularLogoBold!!
    }

@Suppress("ObjectPropertyName")
private var _AngularLogoBold: ImageVector? = null
