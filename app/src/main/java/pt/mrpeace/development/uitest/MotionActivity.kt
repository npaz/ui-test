package pt.mrpeace.development.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_motion.*

class MotionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion)



        Handler().postDelayed({
            Toast.makeText(this,"setTransition",Toast.LENGTH_LONG).show()

            master_container.setTransition(R.id.start, R.id.end);
            master_container.transitionToEnd()
        },3000)

    }
}