package mobiles.cucei.ciep

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_11.*
import mobiles.cucei.ciep.R.layout.datos_numericos_evaluacion_00
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_00.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_01.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_02.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_03.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_04.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_05.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_06.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_07.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_08.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_09.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_10.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_11.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_12.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_13.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_15.*
import mobiles.cucei.ciep.R.layout.datos_numericos_evaluacion_01

/**
 * Created by deimi on 10/22/2017.
 */
class DatosNumericosAutoevaluacionActivity : AppCompatActivity() {

    private val viewsDatosNumericosEvaluacion:ArrayList<Int> = ArrayList()

    private var currentViewIndex = 0
    private var currentView:View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datos_numericos_evaluacion_00)

        for(cont in 0..16){
            viewsDatosNumericosEvaluacion.add(datos_numericos_evaluacion_01 + cont)
        }

        setFrameView(R.layout.datos_numericos_evaluacion_01)
    }

    fun setFrameView(view:Int){
        val layout = LayoutInflater.from(this).inflate(view,null)
        datos_numericos_evaluacion_content.removeView(currentView)
        datos_numericos_evaluacion_content.addView(layout)

        currentView = layout
    }

    fun onClick(view: View){
        when(view){
            respuesta1_1 -> handleAnswer(texto1_1,texto1_4,R.string.respuesta_1_4)
            respuesta1_2 -> handleAnswer(texto1_2,texto1_4,R.string.respuesta_1_4)
            respuesta1_3 -> handleAnswer(texto1_3,texto1_4,R.string.respuesta_1_4)
            respuesta1_4 -> handleAnswer(texto1_4,texto1_4,R.string.respuesta_1_4)

            respuesta2_1 -> handleAnswer(texto2_1,texto2_2,R.string.respuesta_2_2)
            respuesta2_2 -> handleAnswer(texto2_2,texto2_2,R.string.respuesta_2_2)
            respuesta2_3 -> handleAnswer(texto2_3,texto2_2,R.string.respuesta_2_2)
            respuesta2_4 -> handleAnswer(texto2_4,texto2_2,R.string.respuesta_2_2)

            respuesta3_1 -> handleAnswer(texto3_1,texto3_2,R.string.respuesta_3_2)
            respuesta3_2 -> handleAnswer(texto3_2,texto3_2,R.string.respuesta_3_2)
            respuesta3_2 -> handleAnswer(texto3_3,texto3_2,R.string.respuesta_3_2)
            respuesta3_2 -> handleAnswer(texto3_4,texto3_2,R.string.respuesta_3_2)

            respuesta5_1 -> handleAnswer(texto5_1,texto5_4,R.string.respuesta_4_4)
            respuesta5_2 -> handleAnswer(texto5_2,texto5_4,R.string.respuesta_4_4)
            respuesta5_3 -> handleAnswer(texto5_3,texto5_4,R.string.respuesta_4_4)
            respuesta5_4 -> handleAnswer(texto5_4,texto5_4,R.string.respuesta_4_4)

            respuesta6_1 -> handleAnswer(texto6_1,texto6_4,R.string.respuesta_5_4)
            respuesta6_2 -> handleAnswer(texto6_2,texto6_4,R.string.respuesta_5_4)
            respuesta6_3 -> handleAnswer(texto6_3,texto6_4,R.string.respuesta_5_4)
            respuesta6_4 -> handleAnswer(texto6_4,texto6_4,R.string.respuesta_5_4)

            respuesta7_1 -> handleAnswer(texto7_1,texto7_4,R.string.respuesta_6_4)
            respuesta7_2 -> handleAnswer(texto7_2,texto7_4,R.string.respuesta_6_4)
            respuesta7_3 -> handleAnswer(texto7_3,texto7_4,R.string.respuesta_6_4)
            respuesta7_4 -> handleAnswer(texto7_4,texto7_4,R.string.respuesta_6_4)

            respuesta8_1 -> handleAnswer(texto8_1,texto8_1,R.string.respuesta_7_1)
            respuesta8_2 -> handleAnswer(texto8_2,texto8_1,R.string.respuesta_7_1)
            respuesta8_3 -> handleAnswer(texto8_3,texto8_1,R.string.respuesta_7_1)
            respuesta8_4 -> handleAnswer(texto8_4,texto8_1,R.string.respuesta_7_1)

            respuesta9_1 -> handleAnswer(texto9_1,texto9_3,R.string.respuesta_8_3)
            respuesta9_2 -> handleAnswer(texto9_2,texto9_3,R.string.respuesta_8_3)
            respuesta9_3 -> handleAnswer(texto9_3,texto9_3,R.string.respuesta_8_3)
            respuesta9_4 -> handleAnswer(texto9_4,texto9_3,R.string.respuesta_8_3)

            respuesta10_1 -> handleAnswer(texto10_1,texto10_3,R.string.respuesta_9_3)
            respuesta10_2 -> handleAnswer(texto10_2,texto10_3,R.string.respuesta_9_3)
            respuesta10_3 -> handleAnswer(texto10_3,texto10_3,R.string.respuesta_9_3)
            respuesta10_4 -> handleAnswer(texto10_4,texto10_3,R.string.respuesta_9_3)

            respuesta11_1 -> handleAnswer(texto11_1,texto11_4,R.string.respuesta_10_4)
            respuesta11_2 -> handleAnswer(texto11_2,texto11_4,R.string.respuesta_10_4)
            respuesta11_3 -> handleAnswer(texto11_3,texto11_4,R.string.respuesta_10_4)
            respuesta11_4 -> handleAnswer(texto11_4,texto11_4,R.string.respuesta_10_4)

            respuesta12_1 -> handleAnswer(texto12_1,texto12_2,R.string.respuesta_11_2)
            respuesta12_2 -> handleAnswer(texto12_2,texto12_2,R.string.respuesta_11_2)
            respuesta12_3 -> handleAnswer(texto12_3,texto12_2,R.string.respuesta_11_2)
            respuesta12_4 -> handleAnswer(texto12_4,texto12_2,R.string.respuesta_11_2)

            respuesta13_1 -> handleAnswer(texto13_1,texto13_3,R.string.respuesta_13_3)
            respuesta13_2 -> handleAnswer(texto13_2,texto13_3,R.string.respuesta_13_3)
            respuesta13_3 -> handleAnswer(texto13_3,texto13_3,R.string.respuesta_13_3)
            respuesta13_4 -> handleAnswer(texto13_4,texto13_3,R.string.respuesta_13_3)

            respuesta14_1 -> handleAnswer(texto14_1,texto14_2,R.string.respuesta_14_2)
            respuesta14_2 -> handleAnswer(texto14_2,texto14_2,R.string.respuesta_14_2)
            respuesta14_3 -> handleAnswer(texto14_3,texto14_2,R.string.respuesta_14_2)
            respuesta14_4 -> handleAnswer(texto14_4,texto14_2,R.string.respuesta_14_2)

            else -> {
                datos_numericos_evaluacion_text_numero_pagina.setText((currentViewIndex+2).toString() + "/14")
                setFrameView(viewsDatosNumericosEvaluacion[currentViewIndex + 1])
                currentViewIndex++
            }
        }
    }

    fun onFinish(view: View){
        finish()
    }

    fun handleAnswer(view: View,viewCorrect: View,stringId:Int){
        viewCorrect.setBackgroundResource(R.drawable.rectangulo_redondeado_verde)
        showAnswer(view == viewCorrect,view,stringId)
    }

    fun showAnswer(correct: Boolean,view: View,stringId: Int){
        val alertDialog = AlertDialog.Builder(this,R.style.DialogTheme)
        if(correct){
            alertDialog.setTitle("Respuesta Correcta")
        }else{
            view.setBackgroundResource(R.drawable.rectangulo_redondeado_rojo)
            alertDialog.setTitle("Respuesta Incorrecta")
        }
        alertDialog.setMessage(getString(stringId))
        alertDialog.setPositiveButton("Continuar",{dialogInterface, _->
            onClick(datos_numericos_evaluacion_content)
            dialogInterface.dismiss()
        })
        alertDialog.create()
        alertDialog.show()
    }

}