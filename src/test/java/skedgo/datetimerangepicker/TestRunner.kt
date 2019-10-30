package skedgo.datetimerangepicker

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid
import org.junit.runners.model.InitializationError
import org.robolectric.RobolectricTestRunner

/**
 * To workaround https://github.com/robolectric/robolectric/issues/1430.
 */
class TestRunner @Throws(InitializationError::class)
constructor(klass: Class<*>) : RobolectricTestRunner(klass) {

    internal class TestApp : Application() {
        override fun onCreate() {
            super.onCreate()
            JodaTimeAndroid.init(this)
        }
    }
}