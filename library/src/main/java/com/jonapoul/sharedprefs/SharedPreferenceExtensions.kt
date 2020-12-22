package com.jonapoul.sharedprefs

import android.content.SharedPreferences

fun SharedPreferences.parseIntFromPair(pref: PrefPair<String>): Int {
    return this.getString(pref.key, pref.default)!!.toInt()
}

fun SharedPreferences.getLongFromPair(pref: PrefPair<Long>): Long {
    return this.getLong(pref.key, pref.default)
}

fun SharedPreferences.getStringFromPair(pref: PrefPair<String>): String {
    return this.getString(pref.key, pref.default)!!
}

fun SharedPreferences.getBooleanFromPair(pref: PrefPair<Boolean>): Boolean {
    return this.getBoolean(pref.key, pref.default)
}

fun SharedPreferences.getStringSetFromPair(pref: PrefPair<Set<String>>): Set<String> {
    return this.getStringSet(pref.key, pref.default)!!
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
