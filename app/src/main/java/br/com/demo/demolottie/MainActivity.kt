package br.com.demo.demolottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.BtnTransform
import kotlinx.android.synthetic.main.activity_main.animationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        BtnTransform.setOnClickListener {
            if(!animationView.isAnimating)
                animationView.playAnimation()
            else
                animationView.pauseAnimation()
        }
    }
}
