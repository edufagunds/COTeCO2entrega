package br.com.appcoteco_2entrega

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCliente = findViewById<ImageView>(R.id.img_cliente)
        val imgServico = findViewById<ImageView>(R.id.img_servico)
        val imgContato = findViewById<ImageView>(R.id.img_contato)
        val imgSobre   = findViewById<ImageView>(R.id.img_sobre)

        imgCliente.setOnClickListener{
            IrParaCliente()
        }
        imgServico.setOnClickListener{
            IrParaServico()
        }
        imgContato.setOnClickListener{
            IrParaContato()
        }
        imgSobre.setOnClickListener{
            IrParaSobre()
        }

    }

        private fun IrParaCliente(){
            val cliente = Intent(this, activity_cliente::class.java)
            startActivity(cliente)
        }

        private fun IrParaServico(){
            val servico = Intent(this, activity_servico::class.java)
            startActivity(servico)
        }

        private fun IrParaContato(){
            val contato = Intent(this, activity_contato::class.java)
            startActivity(contato)
        }

        private fun IrParaSobre(){
            val sobre = Intent(this, activity_sobre::class.java)
            startActivity(sobre)
        }

}