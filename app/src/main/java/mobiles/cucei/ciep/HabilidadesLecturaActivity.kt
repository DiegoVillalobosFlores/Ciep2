package mobiles.cucei.ciep

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import mobiles.cucei.ciep.R.layout.habilidades_de_lectura_01
import mobiles.cucei.ciep.autoevaluaciones.HabilidadesLectura

/**
 * Created by deimi on 10/13/2017.
 */

class HabilidadesLecturaActivity : AppCompatActivity() {

    private var currentView = habilidades_de_lectura_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.habilidades_de_lectura_01)

    }

    fun onClick(view: View){
        currentView++
        setContentView(currentView)
    }

    fun onClickBack(view: View){
        currentView--
        setContentView(currentView)
    }

    fun onFinish(view: View){
        finish()
    }

    fun startTest(view: View){
        finish()
        val intent = Intent(this,HabilidadesLectura::class.java)
        startActivity(intent)
    }
}