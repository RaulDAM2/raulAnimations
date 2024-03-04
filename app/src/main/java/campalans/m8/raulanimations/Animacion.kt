package campalans.m8.raulanimations

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import campalans.m8.raulanimations.databinding.ActivityAnimacionBinding

class Animacion : AppCompatActivity() {
    private lateinit var binding: ActivityAnimacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ball.setOnClickListener {
            startMainActivity()
        }

        val bounceAnimation = AnimationUtils.loadAnimation(this, R.anim.animation_ball)
        binding.ball.startAnimation(bounceAnimation)
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
    }
}
