package com.example.hw3_login

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pass_change.*

class Pass_change : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pass_change)

        back.setOnClickListener {
            super.onBackPressed()
        }

        change2.setOnClickListener {
            if(et_sign_in_changePass.text.toString() == et_sign_in_changePass2.text.toString()){
                Log_in.PasswordRepository.password = et_sign_in_changePass.text.toString()
                super.onBackPressed()
                Toast.makeText(this,"password changed", Toast.LENGTH_LONG).show()
            }
            else {
                setPasswordError()
            }

        }

        et_sign_in_changePass2.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                ti_sign_in_changePass2.error = null
                ti_sign_in_changePass2.isErrorEnabled = false
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })
    }

    private fun setPasswordError() {
        et_sign_in_changePass2.error = getString(R.string.incorrect_password)
    }
}
