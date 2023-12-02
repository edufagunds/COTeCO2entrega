package br.com.appcoteco_2entrega


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView


class activity_sobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        val imgVoltar = findViewById<ImageView>(R.id.img_voltar_inicio_sobre)


        imgVoltar.setOnClickListener{
            finish()
        }

    }

}





