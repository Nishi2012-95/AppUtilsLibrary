package com.nncc.appUtils

import android.widget.EditText

object EditTextUtils {
    fun showEditTextCursor(editText: EditText) {
        editText.isCursorVisible = true
        editText.requestFocus()
    }
}