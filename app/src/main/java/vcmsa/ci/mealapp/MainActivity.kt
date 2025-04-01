package vcmsa.ci.mealapp
/*
https://www.pexels.com/photo/red-strawberries-and-stainless-steel-spoons-on-a-black-surface-8019484/
*/

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var screen1Title: TextView
    private lateinit var screen1Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        screen1Title = findViewById(R.id.tvAppName)
        screen1Button = findViewById(R.id.btnLetsCook)

        screen1Button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}