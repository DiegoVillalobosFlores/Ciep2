package mobiles.cucei.ciep.autoevaluaciones

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
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
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_14.*
import kotlinx.android.synthetic.main.datos_numericos_evaluacion_15.*
import mobiles.cucei.ciep.DatosNumericosActivity
import mobiles.cucei.ciep.R
import mobiles.cucei.ciep.R.layout.*

/**
 * Created by deimi on 10/22/2017.
 */
class DatosNumericos : AppCompatActivity() {

    private val viewsDatosNumericosEvaluacion:ArrayList<Int> = ArrayList()

    private var currentViewIndex = 0
    private var currentView:View? = null
    private var correctAnswers = 0

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
            respuesta1_1 -> handleAnswer(texto1_1,texto1_4, R.string.respuesta_1_4)
            respuesta1_2 -> handleAnswer(texto1_2,texto1_4, R.string.respuesta_1_4)
            respuesta1_3 -> handleAnswer(texto1_3,texto1_4, R.string.respuesta_1_4)
            respuesta1_4 -> handleAnswer(texto1_4,texto1_4, R.string.respuesta_1_4)

            respuesta2_1 -> handleAnswer(texto2_1,texto2_2, R.string.respuesta_2_2)
            respuesta2_2 -> handleAnswer(texto2_2,texto2_2, R.string.respuesta_2_2)
            respuesta2_3 -> handleAnswer(texto2_3,texto2_2, R.string.respuesta_2_2)
            respuesta2_4 -> handleAnswer(texto2_4,texto2_2, R.string.respuesta_2_2)

            respuesta3_1 -> handleAnswer(texto3_1,texto3_2, R.string.respuesta_3_2)
            respuesta3_2 -> handleAnswer(texto3_2,texto3_2, R.string.respuesta_3_2)
            respuesta3_3 -> handleAnswer(texto3_3,texto3_2, R.string.respuesta_3_2)
            respuesta3_4 -> handleAnswer(texto3_4,texto3_2, R.string.respuesta_3_2)

            respuesta5_1 -> handleAnswer(texto5_1,texto5_4, R.string.respuesta_4_4)
            respuesta5_2 -> handleAnswer(texto5_2,texto5_4, R.string.respuesta_4_4)
            respuesta5_3 -> handleAnswer(texto5_3,texto5_4, R.string.respuesta_4_4)
            respuesta5_4 -> handleAnswer(texto5_4,texto5_4, R.string.respuesta_4_4)

            respuesta6_1 -> handleAnswer(texto6_1,texto6_4, R.string.respuesta_5_4)
            respuesta6_2 -> handleAnswer(texto6_2,texto6_4, R.string.respuesta_5_4)
            respuesta6_3 -> handleAnswer(texto6_3,texto6_4, R.string.respuesta_5_4)
            respuesta6_4 -> handleAnswer(texto6_4,texto6_4, R.string.respuesta_5_4)

            respuesta7_1 -> handleAnswer(texto7_1,texto7_4, R.string.respuesta_6_4)
            respuesta7_2 -> handleAnswer(texto7_2,texto7_4, R.string.respuesta_6_4)
            respuesta7_3 -> handleAnswer(texto7_3,texto7_4, R.string.respuesta_6_4)
            respuesta7_4 -> handleAnswer(texto7_4,texto7_4, R.string.respuesta_6_4)

            respuesta8_1 -> handleAnswer(texto8_1,texto8_1, R.string.respuesta_7_1)
            respuesta8_2 -> handleAnswer(texto8_2,texto8_1, R.string.respuesta_7_1)
            respuesta8_3 -> handleAnswer(texto8_3,texto8_1, R.string.respuesta_7_1)
            respuesta8_4 -> handleAnswer(texto8_4,texto8_1, R.string.respuesta_7_1)

            respuesta9_1 -> handleAnswer(texto9_1,texto9_3, R.string.respuesta_8_3)
            respuesta9_2 -> handleAnswer(texto9_2,texto9_3, R.string.respuesta_8_3)
            respuesta9_3 -> handleAnswer(texto9_3,texto9_3, R.string.respuesta_8_3)
            respuesta9_4 -> handleAnswer(texto9_4,texto9_3, R.string.respuesta_8_3)

            respuesta10_1 -> handleAnswer(texto10_1,texto10_3, R.string.respuesta_9_3)
            respuesta10_2 -> handleAnswer(texto10_2,texto10_3, R.string.respuesta_9_3)
            respuesta10_3 -> handleAnswer(texto10_3,texto10_3, R.string.respuesta_9_3)
            respuesta10_4 -> handleAnswer(texto10_4,texto10_3, R.string.respuesta_9_3)

            respuesta11_1 -> handleAnswer(texto11_1,texto11_4, R.string.respuesta_10_4)
            respuesta11_2 -> handleAnswer(texto11_4,texto11_4, R.string.respuesta_10_4)
            respuesta11_3 -> handleAnswer(texto11_4,texto11_4, R.string.respuesta_10_4)
            respuesta11_4 -> handleAnswer(texto11_4,texto11_4, R.string.respuesta_10_4)

            respuesta12_1 -> handleAnswer(texto12_1,texto12_2, R.string.respuesta_11_2)
            respuesta12_2 -> handleAnswer(texto12_2,texto12_2, R.string.respuesta_11_2)
            respuesta12_3 -> handleAnswer(texto12_3,texto12_2, R.string.respuesta_11_2)
            respuesta12_4 -> handleAnswer(texto12_4,texto12_2, R.string.respuesta_11_2)

            respuesta13_1 -> handleAnswer(texto13_1,texto13_1, R.string.respuesta_12_1)
            respuesta13_2 -> handleAnswer(texto13_2,texto13_1, R.string.respuesta_12_1)
            respuesta13_3 -> handleAnswer(texto13_3,texto13_1, R.string.respuesta_12_1)
            respuesta13_4 -> handleAnswer(texto13_4,texto13_1, R.string.respuesta_12_1)

            respuesta14_1 -> handleAnswer(texto14_1,texto14_3, R.string.respuesta_13_3)
            respuesta14_2 -> handleAnswer(texto14_2,texto14_3, R.string.respuesta_13_3)
            respuesta14_3 -> handleAnswer(texto14_3,texto14_3, R.string.respuesta_13_3)
            respuesta14_4 -> handleAnswer(texto14_4,texto14_3, R.string.respuesta_13_3)

            respuesta15_1 -> handleAnswer(texto15_1,texto15_2, R.string.respuesta_14_2)
            respuesta15_2 -> handleAnswer(texto15_2,texto15_2, R.string.respuesta_14_2)
            respuesta15_3 -> handleAnswer(texto15_3,texto15_2, R.string.respuesta_14_2)
            respuesta15_4 -> handleAnswer(texto15_4,texto15_2, R.string.respuesta_14_2)

            imagen4_pantalla28_datosnumericos -> setFrameView(R.layout.datos_numericos_evaluacion_16)

            else -> {
                datos_numericos_evaluacion_text_numero_pagina.setText((currentViewIndex+2).toString() + "/14")
                currentViewIndex++
                setFrameView(viewsDatosNumericosEvaluacion[currentViewIndex])
            }
        }
    }

    fun onFinish(view: View){
        finish()
    }

    fun finishTest(){
        datos_numericos_evaluacion_fooder.visibility = View.GONE
        setFrameView(R.layout.datos_numericos_evaluacion_15)
        var avg = (correctAnswers * 100) / 14
        avg = (avg * 5) / 100

        val starsViews:ArrayList<ImageView> = ArrayList()
        starsViews.add(estrella1_pantalla28_datosnumericos)
        starsViews.add(estrella2_pantalla28_datosnumericos)
        starsViews.add(estrella3_pantalla28_datosnumericos)
        starsViews.add(estrella4_pantalla28_datosnumericos)
        starsViews.add(estrella5_pantalla28_datosnumericos)

        Log.w("AVG",avg.toString())

        val draw:Drawable = ContextCompat.getDrawable(this, R.drawable.estrella_bien_datosnumericos)
        for(cont in 0 until avg){
            starsViews[cont].setImageDrawable(draw)
        }

        if(avg >= 4){
            val bigStar = ContextCompat.getDrawable(this,R.drawable.estrellagrande)
            texto1_pantalla28_datosnumericos.text = "!Felicidades¡"
            texto2_pantalla28_datosnumericos.text = "Haz completado con éxito la guía de aprendizaje:"
            imagen2_pantalla28_datosnumericos.visibility = View.INVISIBLE
            imagen1_pantalla28_datosnumericos.setImageDrawable(bigStar)
        }
    }

    fun onRestart(view: View){
        val intent = Intent(this, DatosNumericosActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun handleAnswer(view: View,viewCorrect: View,stringId:Int){
        view.setBackgroundResource(R.drawable.rectangulo_redondeado_rojo)
        viewCorrect.setBackgroundResource(R.drawable.rectangulo_redondeado_verde)

        when(viewCorrect){
            texto11_4 -> {view.setBackgroundResource(R.drawable.rectangulonormal_rojo)
                          viewCorrect.setBackgroundResource(R.drawable.rectangulonormal_verde)}
            texto12_2 -> {view.setBackgroundResource(R.drawable.rectangulonormal_rojo)
                viewCorrect.setBackgroundResource(R.drawable.rectangulonormal_verde)}
            texto13_1 -> {view.setBackgroundResource(R.drawable.rectangulonormal_rojo)
                viewCorrect.setBackgroundResource(R.drawable.rectangulonormal_verde)}
            texto14_3 -> {view.setBackgroundResource(R.drawable.rectangulonormal_rojo)
                viewCorrect.setBackgroundResource(R.drawable.rectangulonormal_verde)}
            texto15_2 -> {view.setBackgroundResource(R.drawable.rectangulonormal_rojo)
                viewCorrect.setBackgroundResource(R.drawable.rectangulonormal_verde)}
        }

        showAnswer(view == viewCorrect,view,stringId)

    }

    fun showAnswer(correct: Boolean,view: View,stringId: Int){
        val alertDialog = AlertDialog.Builder(this, R.style.DialogTheme)
        if(correct){
            alertDialog.setTitle("Respuesta Correcta")
            correctAnswers++
        }else{
            alertDialog.setTitle("Respuesta Incorrecta")
        }
        alertDialog.setMessage(getString(stringId))
        alertDialog.setPositiveButton("Continuar",{dialogInterface, _->
            when(view){
                texto15_1 -> finishTest()
                texto15_2 -> finishTest()
                texto15_3 -> finishTest()
                texto15_4 -> finishTest()
                else -> onClick(datos_numericos_evaluacion_content)
            }
            dialogInterface.dismiss()
        })
        alertDialog.create()
        alertDialog.show()
    }

}