package br.com.connect.appmegasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Busca a referencia dos objetos pelo id do layout
        val editText: EditText = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.txt_result)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

//        opcao 3 é a mais recomendada por ser mais simples
        btnGenerate.setOnClickListener {

            val text = editText.text.toString()

            numberGeneretor(text, txtResult)
        }
    }

    private fun numberGeneretor(text: String, txtResult: TextView){
        if(text.isNotEmpty()){
            val qtd = text.toInt()
            if(qtd >= 6 && qtd <= 15){

                val numbers = mutableSetOf<Int>()
                val random = Random()
                while(true){
                    val number = random.nextInt(60)
                    numbers.add(number + 1)

                    if(numbers.size == qtd) {
                        break
                    }
                }

//                for(x in numbers) {
//                    Log.i("teste", "numero que saiu: $x")
//                }

                txtResult.text = numbers.joinToString(" - ")

            } else {
                Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
            }


        } else {
            Toast.makeText(this, "Informe um número entre 6 e 15", Toast.LENGTH_LONG).show()
        }
    }


}