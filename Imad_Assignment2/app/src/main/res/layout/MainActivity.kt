package layout

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var petImageView: ImageView
    private lateinit var statusTextView: TextView

    private var hungerLevel = 5
    private var happinessLevel = 5
    private var cleanlinessLevel = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        petImageView = findViewById(R.id.petImageView)
        statusTextView = findViewById(R.id.statusTextView)

        updateStatus()

        findViewById<Button>(R.id.feedButton).setOnClickListener {
            feedPet()
        }

        findViewById<Button>(R.id.playButton).setOnClickListener {
            playWithPet()
        }

        findViewById<Button>(R.id.cleanButton).setOnClickListener {
            cleanPet()
        }
    }

    private fun updateStatus() {
        statusTextView.text = "Hunger: $hungerLevel, Happiness: $happinessLevel, Cleanliness: $cleanlinessLevel"
    }

    private fun feedPet() {
        if (hungerLevel < 10) {
            hungerLevel++
            updateStatus()
            showToast("You fed your pet.")
            petImageView.setImageResource(R.drawable.feeding_image)
        } else {
            showToast("Your pet is not hungry right now.")
        }
    }

    private fun playWithPet() {
        if (happinessLevel < 10) {
            happinessLevel++
            updateStatus()
            showToast("You played with your pet.")
            petImageView.setImageResource(R.drawable.playing_image)
        } else {
            showToast("Your pet is too happy to play right now.")
        }
    }

    private fun cleanPet() {
        if (cleanlinessLevel < 10) {
            cleanlinessLevel++
            updateStatus()
            showToast("You cleaned your pet.")
            petImageView.setImageResource(R.drawable.cleaning_image)
        } else {
            showToast("Your pet is already clean.")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
