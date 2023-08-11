package com.example.kosha


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.kosha.gita.GitaActivity
import com.example.kosha.mahabharata.MahabharataActivity
import com.example.kosha.ramayana.RamayanaActivity
import com.tomer.fadingtextview.FadingTextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val content1 = findViewById<View>(R.id.content1)
        val content2 = findViewById<View>(R.id.content2)
        val content3 = findViewById<View>(R.id.content3)


        val text1 = getString(R.string.quote1)
        val text2 = getString(R.string.quote2)
        val text3 = getString(R.string.quote3)
        val text4 = getString(R.string.quote4)
        val text5 = getString(R.string.quote5)
        val text6 = getString(R.string.quote6)
        val quotes = arrayOf(
            text1,
            text2,
            text3,
            text4,
            text5,
            text6
        )

        val fadingTextView: FadingTextView = findViewById(R.id.quote)
        fadingTextView.setTexts(quotes)



        content1.setOnClickListener {
            val intent = Intent(this, GitaActivity::class.java)
            startActivity(intent)
        }
        content2.setOnClickListener {
            val intent = Intent(this, RamayanaActivity::class.java)
            startActivity(intent)
        }
        content3.setOnClickListener {
            val intent = Intent(this, MahabharataActivity::class.java)
            startActivity(intent)
        }

        val button = findViewById<ImageButton>(R.id.hamburger)
        button.setOnClickListener {
            val bottomSheetDialog = CustomBottomSheetDialog(this)
            bottomSheetDialog.show()

        }
    }
}
