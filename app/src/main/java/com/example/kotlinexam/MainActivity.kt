package com.example.kotlinexam

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import android.widget.TextView
import android.widget.ImageView

val quoteList = listOf(Pair("Even your greatest mistakes shouldn't stop you from moving forward." , "Edward Elric"),Pair("I'll take a potato chip....and eat it!","Light Yagami"),Pair("the circumstances of one's birth are irrevelant. It is what you do with the gift of life that determines who you are.","Mewtwo"),Pair("It is never a crime to just exist, no matter how dangerous your weapons are.","Franky"))
var iterInt = 0 ;
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val addButton: Button = findViewById(R.id.add_button)
        addButton.setOnClickListener{
            shoQuote()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    private fun shoQuote()
    {

        val randomInt = (0..quoteList.size-1).random()

        iterInt = (iterInt+1)%quoteList.size
        val textDisplay: TextView = findViewById(R.id.quote)
        val authorDisplay: TextView = findViewById(R.id.author)
        val (a,b) = quoteList[iterInt]

        textDisplay.text = "'" + a + "'\n"
        authorDisplay.text = "-  " + b

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
