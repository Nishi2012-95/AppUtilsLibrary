package com.nncc.appUtils

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.nncc.interfaces.AlertDialogListener

object GeneralAppUtils {
    fun appUpdateAvailable(context: Context, appPackageName: String, title: String, msg: String, positiveBtn: String) {
        DialogUtil.showAlertDialogForEvent(
                title,
                msg,
                positiveBtn,
                "",
                context,
                object : AlertDialogListener {
                    override fun onAlertDialogEventChanged(isPositive: Boolean) {
                        if (isPositive) {

                            try {
                                context.startActivity(
                                        Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$appPackageName")))
                            } catch (anfe: ActivityNotFoundException) {
                                context.startActivity(
                                        Intent(Intent.ACTION_VIEW,
                                                Uri.parse(
                                                        "https://play.google.com/store/apps/details?id=$appPackageName")))
                            }
                        }
                    }

                })
    }

}

