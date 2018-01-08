package mobiles.cucei.ciep.autoevaluaciones

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_01.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_02.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_03.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_04.*
import mobiles.cucei.ciep.R
import mobiles.cucei.ciep.R.layout.habilidades_de_lectura_evaluacion_01

/**
 * Created by deimi on 11/20/2017.
 */
class HabilidadesLectura : AppCompatActivity() {

    private var currentView = habilidades_de_lectura_evaluacion_01
    private var correctas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habilidades_de_lectura_evaluacion_01)


    }

    fun onClick(view: View){
        when(view){
            verdadero1 -> evaluateAnswer(verdadero1,verdadero1,true)
            falso1 -> evaluateAnswer(falso1,verdadero1,true)

            verdadero2 -> evaluateAnswer(verdadero2,falso2,false)
            falso2 -> evaluateAnswer(falso2,falso2,false)

            verdadero3 -> evaluateAnswer(verdadero1,falso3,false)
            falso3 -> evaluateAnswer(falso3,falso3,false)

            verdadero4 -> evaluateAnswer(verdadero4,verdadero4,true)
            falso4 -> evaluateAnswer(falso4,verdadero1,true)
        }
    }

    private fun nextQuestion(){
        currentView++;
        setContentView(currentView)
    }

    private fun evaluateAnswer(view: ImageView, correctView: ImageView, verdadero:Boolean){
        var drawable = ContextCompat.getDrawable(this,R.drawable.verdaderorojo)
        if(verdadero){
            drawable = ContextCompat.getDrawable(this,R.drawable.verdaderoverde)
        }else{
            drawable = ContextCompat.getDrawable(this,R.drawable.falsoverde)

        }

        correctView.setImageDrawable(drawable)

        val mensaje:String
        if(view != correctView){
            mensaje = "Respuesta Incorrecta"
            if(verdadero){
                view.setImageDrawable(drawable)
            }else{
                drawable = ContextCompat.getDrawable(this,R.drawable.falsorojo)
                view.setImageDrawable(drawable)
            }
        }else {
            mensaje = "Respuesta Correcta"
            correctas++
        }
    }
}