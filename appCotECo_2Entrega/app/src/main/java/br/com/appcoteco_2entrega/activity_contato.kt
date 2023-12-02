package br.com.appcoteco_2entrega

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class activity_contato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)

        val imgVoltar = findViewById<ImageView>(R.id.img_voltar_inicio)

        imgVoltar.setOnClickListener{
            finish()
        }

    }
}