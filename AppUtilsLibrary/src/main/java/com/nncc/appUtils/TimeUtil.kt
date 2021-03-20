package com.nncc.appUtils

import java.util.*

object TimeUtil {
    fun getDefaultTimeZoneId(): String {
        val tz: TimeZone = TimeZone.getDefault()
        return tz.id
    }
}

