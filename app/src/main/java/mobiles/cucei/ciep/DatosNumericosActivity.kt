package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.datos_numericos_00.*

class DatosNumericosActivity : AppCompatActivity() {

    private val viewsDatosPorcentajes:ArrayList<Int> = ArrayList()
    private val viewsDatosGraficas:ArrayList<Int> = ArrayList()
    private val viewsDatosHistogramas:ArrayList<Int> = ArrayList()
    private val viewsDatosAutoevaluacion:ArrayList<Int> = ArrayList()
    private var currentView:Int = 0

    private val currentAudio:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datos_numericos_01)



    }

    fun onStart(view: View){
        setContentView(R.layout.datos_numericos_00)
        setFrameView(R.layout.datos_numericos_02)
    }

    fun setFrameView(viewId:Int){
        val view = findViewById<View>(viewId)
        datos_numericos_content.removeAllViews()
        datos_numericos_content.addView(view)
    }
}
