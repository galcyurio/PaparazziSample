package com.github.galcyurio.library

import android.widget.LinearLayout
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_5
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

internal class ExampleSnapshotTest {
    @get:Rule
    val paparazzi = Paparazzi(
        deviceConfig = PIXEL_5,
        theme = "android:Theme.Material.Light.NoActionBar"
        // ...see docs for more options
    )

    @Test
    fun simple() {
        val view = LinearLayout(paparazzi.context)
        paparazzi.snapshot(view)
    }
}
