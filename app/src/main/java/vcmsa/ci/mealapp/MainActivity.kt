package vcmsa.ci.mealapp

//Import Statements
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declaring The Variables (Class Definition)
    private lateinit var screen1Title: TextView
    private lateinit var screen1Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initialization Of UI Elements In onCreate
        screen1Title = findViewById(R.id.tvSlogan)
        screen1Button = findViewById(R.id.btnLetsCook)

        //Setting Button Click Listener
        screen1Button.setOnClickListener {
            //Button that takes you to the main activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}