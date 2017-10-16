package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mobiles.cucei.ciep.R.layout.mapas_mentales_01

class MapasMentalesActivity : AppCompatActivity() {

    private val viewsMapas:ArrayList<Int> = ArrayList()
    private var currentView = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapas_mentales_01)

        for(cont in 0..18){
            viewsMapas.add(mapas_mentales_01 + cont)
        }
    }

    fun onClick(view: View){
        setContentView(viewsMapas[currentView] + 1)
        currentView++
    }

    fun onClickBack(view:View){
        setContentView(viewsMapas[currentView] - 1)
        currentView--
    }

    fun onFinish(view:View){
        finish()
    }
}
