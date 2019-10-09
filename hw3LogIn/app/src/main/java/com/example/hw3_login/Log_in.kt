package com.example.hw3_login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.log_in.*

class Log_in : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)

        change.setOnClickListener {
            val intent = Intent(this, Pass_change::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            if(et_sign_in_pass.text.toString() == PasswordRepository.password){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"You have entered an incorrect username or password", Toast.LENGTH_LONG).show()
                setPasswordError()
            }
            progressBar.visibility = View.INVISIBLE
        }

        et_sign_in_pass.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                ti_sign_in_pass.error = null
                ti_sign_in_pass.isErrorEnabled = false
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

        })

    }

    object PasswordRepository {

        var password: String = "doggie"
    }

    private fun setPasswordError() {
        et_sign_in_pass.error = getString(R.string.wrong_password)
    }
}
