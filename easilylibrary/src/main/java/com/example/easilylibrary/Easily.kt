package com.example.easilylibrary

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar


class Easily(c: Context?) {

    private var ctx: Context?

    init {
        ctx = c

    }

    fun showShortToast(message: String) {
        Toast.makeText(ctx!!, message, Toast.LENGTH_SHORT).show()
    }

    fun showLongToast(message: String) {
        Toast.makeText(ctx!!, message, Toast.LENGTH_LONG).show()
    }

    fun showSnackbar(message: String, view: View) {
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
    }

    fun showIndefiniteSnackbar(message: String, view: View) {
        Snackbar.make(view, message, Snackbar.LENGTH_INDEFINITE).show()
    }

    fun logException(TAG: String, exception: Exception) {
        Log.e(TAG, "Exception message ${exception.message}. Cause identified: ${exception.cause}")
    }

    fun logThrowable(TAG: String, throwable: Throwable) {
        Log.e(
            TAG,
            "Error thrown with message ${throwable.message}. Cause identified: ${throwable.cause}"
        )
    }

    fun showProgress(pb: ProgressBar) {
        pb.visibility = View.VISIBLE
    }

    fun hideProgress(pb: ProgressBar) {
        pb.visibility = View.GONE
    }



}