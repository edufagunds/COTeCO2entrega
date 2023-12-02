package br.com.appcoteco_2entrega

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class activity_cliente : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cliente)

        val imgVoltar = findViewById<ImageView>(R.id.img_voltar)
        val imgConta = findViewById<ImageView>(R.id.img_minhaconta)
        val imgCota = findViewById<ImageView>(R.id.img_cotacoes)
        val imgContato = findViewById<ImageView>(R.id.img_contato)

        imgVoltar.setOnClickListener{
            finish()
        }
        imgConta.setOnClickListener{
            exibirMensagem()
        }
        imgCota.setOnClickListener {
            exibirMensagemOutra()
        }
        imgContato.setOnClickListener {
            IrParaContato()
        }

    }

    private fun exibirMensagem(){
        val mensagem = "Funcionalidade ainda não disponível"
        val duracao = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, mensagem, duracao)
        toast.show()
    }

    private fun exibirMensagemOutra(){
        val mensagem_outra = "Voce nao possui Cotacoes"
        val duracao_outra = Toast.LENGTH_SHORT

        val tarefa = Toast.makeText(this, mensagem_outra, duracao_outra)
        tarefa.show()
    }

    private fun IrParaContato(){
        val contato = Intent(this, activity_contato::class.java)
        startActivity(contato)
    }
    }