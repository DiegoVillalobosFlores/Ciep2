package mobiles.cucei.ciep

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_05.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_06.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_07.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_08.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_09.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_10.*
import kotlinx.android.synthetic.main.capacidades_para_el_aprendizage_11.*
import kotlinx.android.synthetic.main.habilidades_de_lectura_evaluacion_05.*
import mobiles.cucei.ciep.R.layout.capacidades_para_el_aprendizage_01

class MatematicasActivity : AppCompatActivity() {

    private var currentView = capacidades_para_el_aprendizage_01
    private var correctas = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.capacidades_para_el_aprendizage_01)

    }

    fun onClick(view: View){
        when(view){
            opcion1_pantalla5_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla5_capacidadesparaelaprendizaje,true)
            opcion2_pantalla5_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla5_capacidadesparaelaprendizaje,false)
            opcion3_pantalla5_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla5_capacidadesparaelaprendizaje,false)
            opcion4_pantalla5_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla5_capacidadesparaelaprendizaje,false)

            opcion1_pantalla6_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla6_capacidadesparaelaprendizaje,false)
            opcion2_pantalla6_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla6_capacidadesparaelaprendizaje,true)
            opcion3_pantalla6_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla6_capacidadesparaelaprendizaje,false)
            opcion4_pantalla6_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla6_capacidadesparaelaprendizaje,false)

            opcion1_pantalla7_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla7_capacidadesparaelaprendizaje,false)
            opcion2_pantalla7_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla7_capacidadesparaelaprendizaje,true)
            opcion3_pantalla7_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla7_capacidadesparaelaprendizaje,false)
            opcion4_pantalla7_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla7_capacidadesparaelaprendizaje,false)

            opcion1_pantalla8_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla8_capacidadesparaelaprendizaje,true)
            opcion2_pantalla8_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla8_capacidadesparaelaprendizaje,false)
            opcion3_pantalla8_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla8_capacidadesparaelaprendizaje,false)
            opcion4_pantalla8_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla8_capacidadesparaelaprendizaje,false)

            opcion1_pantalla9_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla9_capacidadesparaelaprendizaje,true)
            opcion2_pantalla9_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla9_capacidadesparaelaprendizaje,true)
            opcion3_pantalla9_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla9_capacidadesparaelaprendizaje,false)
            opcion4_pantalla9_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla9_capacidadesparaelaprendizaje,false)

            opcion1_pantalla10_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla10_capacidadesparaelaprendizaje,false)
            opcion2_pantalla10_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla10_capacidadesparaelaprendizaje,false)
            opcion3_pantalla10_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla10_capacidadesparaelaprendizaje,true)
            opcion4_pantalla10_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla10_capacidadesparaelaprendizaje,false)

            opcion1_pantalla11_capacidadesparaelaprendizaje -> validateAnswer(respuesta1_pantalla11_capacidadesparaelaprendizaje,true)
            opcion2_pantalla11_capacidadesparaelaprendizaje -> validateAnswer(respuesta2_pantalla11_capacidadesparaelaprendizaje,false)
            opcion3_pantalla11_capacidadesparaelaprendizaje -> validateAnswer(respuesta3_pantalla11_capacidadesparaelaprendizaje,false)
            opcion4_pantalla11_capacidadesparaelaprendizaje -> validateAnswer(respuesta4_pantalla11_capacidadesparaelaprendizaje,true)

            else -> {
                currentView++
                setContentView(currentView)
            }
        }
    }

    fun finishTest(view: View){
        setContentView(R.layout.capacidades_para_el_aprendizage_12)
        var avg = (correctas * 100) / 9
        avg = (avg * 5) / 100

        val estrellas:ArrayList<ImageView> = ArrayList()
        estrellas.add(estrella1_pantalla28_datosnumericos)
        estrellas.add(estrella2_pantalla28_datosnumericos)
        estrellas.add(estrella3_pantalla28_datosnumericos)
        estrellas.add(estrella4_pantalla28_datosnumericos)
        estrellas.add(estrella5_pantalla28_datosnumericos)

        val draw: Drawable = ContextCompat.getDrawable(this, R.drawable.matedorada)
        for(cont in 0 until avg){
            estrellas[cont].setImageDrawable(draw)
        }
        val color = ContextCompat.getColor(this,R.color.Blue)
        val bigStar = ContextCompat.getDrawable(this,R.drawable.estrellagrande)
        if(avg >= 4){
            texto1.text = "!Felicidades¡"
            texto1.setTextColor(color)
            caraoestrellagrande.setImageDrawable(bigStar)
            imagen2_pantalla28_datosnumericos.visibility = View.GONE
            texto2.text = "Haz concluido con éxito la guia de aprendizaje"
        }
    }

    fun validateAnswer(view:ImageView,correct: Boolean){
        var drawable = ContextCompat.getDrawable(this,R.drawable.incorrecto_capacidadesparaelaprendizaje)
        if(correct){
            drawable = ContextCompat.getDrawable(this,R.drawable.correcto_capacidadesparaelaprendizaje)
            correctas++
        }
        view.setImageDrawable(drawable)
    }

    fun onClickBack(view: View){
        currentView--
        setContentView(currentView)
    }

    fun onFinish(view: View){
        finish()
    }
}
