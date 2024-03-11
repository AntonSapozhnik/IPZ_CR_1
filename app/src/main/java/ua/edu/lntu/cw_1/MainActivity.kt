import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ua.edu.lntu.cw_1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val fullNameTextView = findViewById<TextView>(R.id.fullNameTextView)
        val titleTextView = findViewById<TextView>(R.id.titleTextView)
        val contactLinearLayout = findViewById<LinearLayout>(R.id.contactLinearLayout)


