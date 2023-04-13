package br.com.connect.appmegasena

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Busca a referencia dos objetos pelo id do layout
        val editText: EditText = findViewById(R.id.edit_number)
        val txtResult: TextView = findViewById(R.id.txt_result)
        val btnGenerate: Button = findViewById(R.id.btn_generate)

//        Referencia opcao 2
//        btnGenerate.setOnClickListener(buttonClickListemer)

//        opcao 3 é a mais recomendada por ser mais simples
        btnGenerate.setOnClickListener {
            Log.i("teste", "botao clicado!")
        }
    }

//    opcao 1

//    No layout adiciona o onclick e chama ele aqui
//    android:onClick="buttonClicked"

//    fun buttonClicked(view: View){
//    Log.i("teste", "botao clicado!")
//    }

//    opcao 2
//    val buttonClickListemer = object : View.OnClickListener {
//    override fun onClick(v: View?) {
//        Log.i("teste", "botao clicado!")
//    }
//}

}