package com.example.blocodenotas

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.example.blocodenotas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferencia = PreferenciaAnotacao(applicationContext)
        var botaoSalvar = binding.fab

        botaoSalvar = binding.fab

        botaoSalvar.setOnClickListener{
            val anotacaoRecuperado = binding.editConteiner.editAnotacao.text.toString()

            if (anotacaoRecuperado == "") {
                Toast.makeText(this, "Digite alguma coisa...", Toast.LENGTH_SHORT).show()
            } else {
                preferencia.salvarAnotacao(anotacaoRecuperado)
                Toast.makeText(this, "Anotação salva com sucesso!", Toast.LENGTH_SHORT).show()
            }

            val anotacao = preferencia.RecuperarAnotacao()
            if (anotacao != ""){
                binding.editConteiner.editAnotacao.setText(anotacao)
            }
        }

    }




    }

 