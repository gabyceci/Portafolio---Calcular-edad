package gabriela.arevalo.calcularnacimiento

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
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
        val txtNum1 = findViewById<EditText>(R.id.txtNum1)
        val txtNum2 = findViewById<EditText>(R.id.txtNum2)
        val btnResultado = findViewById<Button>(R.id.btnResultado)
        val lblResulta = findViewById<TextView>(R.id.lblResulta)


        val objCalc = Edad()

        btnResultado.setOnClickListener {
            val resul = objCalc.restar(txtNum1.text.toString().toInt(), txtNum2.text.toString().toInt())

            println("Este es el resultado: $resul")

            lblResulta.text = "Su edad es: $resul"
        }




    }
}