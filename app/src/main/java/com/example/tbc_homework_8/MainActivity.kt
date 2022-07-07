package com.example.tbc_homework_8

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import com.example.tbc_homework_8.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       var mainTextView = binding.mainTitle
       var text = getString(R.string.play_the_best_ngames_everyday_nwith_witcher_now)
       var spannableString = SpannableString(text)
       val  fcsGreen: ForegroundColorSpan =  ForegroundColorSpan(Color.GREEN)
        spannableString.setSpan(fcsGreen,36, 43, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mainTextView.setText(spannableString)

        var getStarted = binding.getStartedButton
        getStarted.setOnClickListener{
            Intent(this, AuthorationActivity::class.java).also{
                startActivity(it)
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
                finish()
            }
        }
    }
}