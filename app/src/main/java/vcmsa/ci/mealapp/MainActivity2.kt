package vcmsa.ci.mealapp
/*
https://www.delish.com/cooking/recipe-ideas/g36890133/healthy-meal-prep-recipes/
https://insanelygoodrecipes.com/after-school-snacks/
https://www.allrecipes.com/gallery/breakfast-finger-foods/
https://sharpaspirant.com/meal-prep-ideas-breakfast/#google_vignette
https://www.pexels.com/photo/red-strawberries-and-stainless-steel-spoons-on-a-black-surface-8019484/
*/
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity2 : AppCompatActivity() {

    private lateinit var content: TextView
    private lateinit var timeOfDay: EditText
    private lateinit var searchButton: Button
    private lateinit var clearButton: Button
    private lateinit var mealOutput: TextView
    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        content = findViewById(R.id.tvContent)
        timeOfDay = findViewById(R.id.etTimeOfDay)
        searchButton = findViewById(R.id.btnSearch)
        clearButton = findViewById(R.id.btnClear)
        mealOutput = findViewById(R.id.tvMealOutput)
        exitButton = findViewById(R.id.btnExit)

        searchButton.setOnClickListener {
            handleTimeOfTheDay()
        }
        clearButton.setOnClickListener{
            timeOfDay.text?.clear()
            mealOutput.text = ""

        }
        exitButton.setOnClickListener{
            handleExitButton()
        }
    }
    private fun handleTimeOfTheDay(){

        if (isNotEmpty()) {
            println(timeOfDay.text.toString().lowercase().uppercase())
            when (timeOfDay.text.toString().lowercase().uppercase()) {

                "MORNING" -> mealOutput.text =
                    "Oatmeat \n Greek Yogury with Strawberries \n Waffels \n Friut and Yougurt Bistro \n Muffin Pizza \n BreakFast Burrito"
                "MORNING SNACK" -> mealOutput.text =
                    "Cheese Sticks \n Honey Pecan Muffins \n Crossiant \n Oatmeal Cookies \n Pretzels \n Fruits"
                "LUNCH" -> mealOutput.text =
                    "Chicken and Avo Wrap \n Chicken Salad \n Fresh Spring Rolls \n Creamy Pasta \n Pizza \n Steak Cobb Salad"
                "LUNCH SNACK" -> mealOutput.text =
                    "Peanutbutter Cookies \n Popcorn \n Fruit and Yougurt Popsticle \n Marshmallow Tart \n Gummy Bears \n Blueberry Muffins"
                "DINNER" -> mealOutput.text =
                    "Turkey Gyro Bowl \n Burritos \n Spaghetti And Mince \n Rice and Chicken \n Sushi Sandwich \n Basil Beef Bowl"
                "DINNER SNACK" -> mealOutput.text =
                    "Banana Bread \n Apple Sandwich \n Fruit \n Kabobs \n Donughts \n Ice-Cream \n Mulva Pudding"

                else -> {
                    mealOutput.text = "Alien!"

                }
            }
        }
    }

    private fun isNotEmpty() : Boolean {
        var b = true
        if (timeOfDay.text.toString().trim().isEmpty()){
            timeOfDay.error = "Input Required"
            b = false
        }
        return b
    }
    private fun handleExitButton(){
        finishAffinity()
        exitProcess(1)

    }

}