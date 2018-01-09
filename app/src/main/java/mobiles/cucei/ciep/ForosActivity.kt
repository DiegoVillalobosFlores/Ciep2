package mobiles.cucei.ciep

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.foros_virtuales_12.*
import kotlinx.android.synthetic.main.foros_virtuales_13.*
import kotlinx.android.synthetic.main.foros_virtuales_14.*
import kotlinx.android.synthetic.main.foros_virtuales_15.*
import mobiles.cucei.ciep.R.layout.foros_virtuales_01

/**
 * Created by deimi on 10/13/2017.
 */
class ForosActivity : AppCompatActivity() {

    private var currentView = foros_virtuales_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.foros_virtuales_01)

    }

    fun onClick(view: View){
        when(view){

            respuesta1_pantalla12_forosvirtuales -> validateAnswer(view,respuesta1_pantalla12_forosvirtuales)
            respuesta2_pantalla12_forosvirtuales -> validateAnswer(view,respuesta1_pantalla12_forosvirtuales)
            respuesta3_pantalla12_forosvirtuales -> validateAnswer(view,respuesta1_pantalla12_forosvirtuales)

            respuesta1_pantalla13_forosvirtuales -> validateAnswer(view,respuesta2_pantalla12_forosvirtuales)
            respuesta2_pantalla13_forosvirtuales -> validateAnswer(view,respuesta2_pantalla12_forosvirtuales)

            respuesta1_pantalla14_forosvirtuales -> validateAnswer(view,respuesta1_pantalla14_forosvirtuales)
            respuesta2_pantalla14_forosvirtuales -> validateAnswer(view,respuesta1_pantalla14_forosvirtuales)
            respuesta3_pantalla14_forosvirtuales -> validateAnswer(view,respuesta1_pantalla14_forosvirtuales)

            respuesta1_pantalla15_forosvirtuales -> validateAnswer(view,respuesta1_pantalla15_forosvirtuales)
            respuesta2_pantalla15_forosvirtuales -> validateAnswer(view,respuesta1_pantalla15_forosvirtuales)
            respuesta3_pantalla15_forosvirtuales -> validateAnswer(view,respuesta1_pantalla15_forosvirtuales)

            else -> {
                currentView++
                setContentView(currentView)
            }
        }
    }

    fun validateAnswer(view:View,correctAnswer:View){
        var drawable:Int = ContextCompat.getColor(this,R.color.Green60)

        correctAnswer.setBackgroundColor(drawable)
        if(view != correctAnswer){
            drawable = ContextCompat.getColor(this,R.color.Red40)
            view.setBackgroundColor(drawable)
        }

    }

    fun onClickBack(view: View){
        currentView--
        setContentView(currentView)
    }

    fun onFinish(view: View){
        finish()
    }
}