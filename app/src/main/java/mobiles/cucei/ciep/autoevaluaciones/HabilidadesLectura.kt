package mobiles.cucei.ciep.autoevaluaciones

import android.graphics.drawable.Drawable
import android.opengl.Visibility
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_00.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_01.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_02.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_03.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_04.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_05.*
import mobiles.cucei.ciep.R
import mobiles.cucei.ciep.R.layout.*

/**
 * Created by deimi on 11/20/2017.
 */
class HabilidadesLectura : AppCompatActivity() {

    private var currentView:View ? = null
    private var currentViewIndex:Int = habilidades_de_lectura_evaluacion_01
    private var correctAnswers = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habilidades_de_lectura_evaluacion_00)

        setFrameView(R.layout.habilidades_de_lectura_evaluacion_01)
    }

    fun setFrameView(view:Int){
        val layout = LayoutInflater.from(this).inflate(view,null)
        main_lectura_evaluacion.removeAllViews()
        main_lectura_evaluacion.addView(layout)

        currentView = layout
    }

    fun onFinish(view: View){
        finish()
    }

    fun finishTest(){
        setFrameView(currentViewIndex)
        var avg = (correctAnswers * 100) / 4
        avg = (avg * 5) / 100

        val estrellas:ArrayList<ImageView> = ArrayList()
        estrellas.add(estrella1_pantalla28_datosnumericos)
        estrellas.add(estrella2_pantalla28_datosnumericos)
        estrellas.add(estrella3_pantalla28_datosnumericos)
        estrellas.add(estrella4_pantalla28_datosnumericos)
        estrellas.add(estrella5_pantalla28_datosnumericos)

        val draw: Drawable = ContextCompat.getDrawable(this, R.drawable.estrella_bien_datosnumericos)
        for(cont in 0 until avg){
            estrellas[cont].setImageDrawable(draw)
        }
        val color = ContextCompat.getColor(this,R.color.Blue)
        val bigStar = ContextCompat.getDrawable(this,R.drawable.estrellagrande)
        if(correctAnswers == 4){
            texto1.text = "!Felicidades¡"
            texto1.setTextColor(color)
            caraoestrellagrande.setImageDrawable(bigStar)
            imagen2_pantalla28_datosnumericos.visibility == View.INVISIBLE
            texto2.text = "Con 4 aciertos haz concluido con éxito la guia de aprendizaje:"
        }
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

    private fun evaluateAnswer(view: ImageView, correctView: ImageView, verdadero:Boolean){
        var drawable:Drawable
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
                drawable = ContextCompat.getDrawable(this,R.drawable.falsorojo)
                view.setImageDrawable(drawable)
            }else{
                drawable = ContextCompat.getDrawable(this,R.drawable.verdaderorojo)
                view.setImageDrawable(drawable)
            }
        }else {
            mensaje = "Respuesta Correcta"
            correctAnswers++
        }
        currentViewIndex++
        if(currentViewIndex == habilidades_de_lectura_evaluacion_05){
            Snackbar.make(main_lectura_evaluacion,mensaje,Snackbar.LENGTH_INDEFINITE).setAction("Siguiente",{finishTest()}).show()
        }else{
            Snackbar.make(main_lectura_evaluacion,mensaje,Snackbar.LENGTH_INDEFINITE).setAction("Siguiente",{setFrameView(currentViewIndex)}).show()
        }
    }
}