package com.example.hw2_kotlin

import android.content.ContentValues.TAG
import android.util.Log

class Shrek : CharectersPattern {
    fun shrek(){
        var age = 30
        val skinColor = "green"
        var iq: Int? = null
    }

    override fun whereIsHe():String {
        return "Typa chillit na svoem bolote"
    }

    override fun specialPhrase(): String {
        return "Zaebumba"
    }

    fun consExample(){
        var con = Constructor("Shrack",SherckSkills.KNOCK_THE_DOOR)
        Log.i(TAG,"Constructor task complete successfully")
    }
}