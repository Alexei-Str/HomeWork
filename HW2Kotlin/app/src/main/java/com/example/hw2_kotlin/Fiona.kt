package com.example.hw2_kotlin

class Fiona: CharectersPattern, DailySchedule {

    fun fiona(){
        var age = 28
        var skinColor: String? = null
        var iq = 180
    }

    override fun whatIsSheDoing(): String {
        return "Go to the Shoping"
    }

    override fun specialPhrase(): String {
        return "Shrak?"
    }

    override fun whereIsHe():String {
        return "Yehala s det'mi k mame na weekends"
    }

}