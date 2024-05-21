
package com.example.cambioactivity

import android.content.ClipData.Item
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        /*
        //definir boton
        var btnactivity2: Button
        //asignar
        btnactivity2=findViewById<Button>(R.id.btnCambioActivity2)

        //accion de dar click
        btnactivity2.setOnClickListener{
            //para hacer el cambio de actividad
            //se configura el intent,es el intento de ejecutar una actividad se asigna cual es
            //la actividad que se va a ejecutar ejemplo activity
            var intent= Intent(application,activity2::class.java)
            startActivity(intent)

         */
        //version corta
    }

        fun cambioActivity1(view: View) {
            //se ejecuta el cambio activity
            var intent = Intent(application, activity2::class.java)
            //se ejecuta la actividad
            startActivity(intent)

        }
    fun cambioActivity2(view:View){
        var intent=Intent(application,activity3::class.java)
        var txtNombre=findViewById<EditText>(R.id.txtNombre)
        intent.putExtra("nombre",txtNombre.text.toString())
        startActivity(intent)
    }
}


