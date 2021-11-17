package br.com.demo.demolottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.BtnTransform
import kotlinx.android.synthetic.main.activity_main.animationView
import kotlinx.android.synthetic.main.activity_main.BtnChange

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        BtnTransform.setOnClickListener {
            if (!animationView.isAnimating)
                animationView.playAnimation()
            else
                animationView.pauseAnimation()
        }

        BtnChange.setOnClickListener {
            animationView.setAnimationFromUrl(
                "https://assets1.lottiefiles.com/packages/lf20_sx5e0zms.json"
            )
            animationView.playAnimation()
        }
    }
}
