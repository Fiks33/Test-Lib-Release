package com.android.fik.lib.toast

import android.content.Context
import android.widget.Toast

/**
 * Created by Mochamad Taufik on 27-Nov-18.
 * Email   : thidayat13@gmail.com
 */
object SimpleToast {

    fun longToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }

    fun shortToast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun longToast(context: Context, number: Int){
        Toast.makeText(context, number.toString(), Toast.LENGTH_LONG).show()
    }

    fun shortToast(context: Context, number: Int){
        Toast.makeText(context, number.toString(), Toast.LENGTH_SHORT).show()
    }

    fun longToast(context: Context, number: Long){
        Toast.makeText(context, number.toString(), Toast.LENGTH_LONG).show()
    }

    fun shortToast(context: Context, number: Long){
        Toast.makeText(context, number.toString(), Toast.LENGTH_SHORT).show()
    }

    fun longToast(context: Context, number: Double){
        Toast.makeText(context, number.toString(), Toast.LENGTH_LONG).show()
    }

    fun shortToast(context: Context, number: Double){
        Toast.makeText(context, number.toString(), Toast.LENGTH_SHORT).show()
    }

}
