package com.example.hw2_kotlin

import android.graphics.Shader

class Constructor(name:String, skills:SherckSkills) {
    private var name:String = name
    private var skills:String = skills.toString()
    override fun toString(): String {
        return "$name have skills: $skills"
    }
}