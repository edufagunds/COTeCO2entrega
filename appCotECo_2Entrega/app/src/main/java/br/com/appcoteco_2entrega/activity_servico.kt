package br.com.appcoteco_2entrega


import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast


class activity_servico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_servico)

        val imgVoltar = findViewById<ImageView>(R.id.btn_voltar_inicio)
        val btnAnalisar = findViewById<Button>(R.id.btn_analisar)


        imgVoltar.setOnClickListener{
            finish()
        }

        btnAnalisar.setOnClickListener{
            exibirMensagem()
        }

    }

    private fun exibirMensagem(){
        val mensagem = "Funcionalidade ainda não disponível"
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, mensagem, duracao)
        toast.show()
    }

}





