package com.jonapoul.sharedprefs

import android.content.SharedPreferences

fun SharedPreferences.parseIntFromPair(pref: PrefPair<String>): Int {
    return this.getString(pref.key, pref.default)!!.toInt()
}

fun SharedPreferences.parseDoubleFromPair(pref: PrefPair<String>): Double {
    return this.getString(pref.key, pref.default)!!.toDouble()
}

fun SharedPreferences.parseFloatFromPair(pref: PrefPair<String>): Float {
    return this.getString(pref.key, pref.default)!!.toFloat()
}

fun SharedPreferences.getIntFromPair(pref: PrefPair<Int>): Int {
    return this.getInt(pref.key, pref.default)
}

fun SharedPreferences.getFloatFromPair(pref: PrefPair<Float>): Float {
    return this.getFloat(pref.key, pref.default)
}

fun SharedPreferences.getLongFromPair(pref: PrefPair<Long>): Long {
    return this.getLong(pref.key, pref.default)
}

fun SharedPreferences.getStringFromPair(pref: PrefPair<String>): String {
    return this.getString(pref.key, pref.default)!!
}

fun SharedPreferences.getStringFromPairNoBlank(pref: PrefPair<String>): String {
    val result = getStringFromPair(pref)
    return if (result.isBlank()) pref.default else result
}

fun SharedPreferences.getBooleanFromPair(pref: PrefPair<Boolean>): Boolean {
    return this.getBoolean(pref.key, pref.default)
}

fun SharedPreferences.getStringSetFromPair(pref: PrefPair<Set<String>>): Set<String> {
    return this.getStringSet(pref.key, pref.default)!!
}

fun SharedPreferences.Editor.putIntIfNotNull(
    pref: PrefPair<Int>,
    value: Int?
): SharedPreferences.Editor {
    if (value != null) {
        this.putInt(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putFloatIfNotNull(
    pref: PrefPair<Float>,
    value: Float?
): SharedPreferences.Editor {
    if (value != null) {
        this.putFloat(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putBooleanIfNotNull(
    pref: PrefPair<Boolean>,
    value: Boolean?
): SharedPreferences.Editor {
    if (value != null) {
        this.putBoolean(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putLongIfNotNull(
    pref: PrefPair<Long>,
    value: Long?
): SharedPreferences.Editor {
    if (value != null) {
        this.putLong(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putStringIfNotNull(
    pref: PrefPair<String>,
    value: String?
): SharedPreferences.Editor {
    if (value != null) {
        this.putString(pref.key, value)
    }
    return this
}

fun SharedPreferences.Editor.putStringSetIfNotNull(
    pref: PrefPair<Set<String>>,
    value: Set<String>?
): SharedPreferences.Editor {
    if (value != null) {
        this.putStringSet(pref.key, value)
    }
    return this
}
