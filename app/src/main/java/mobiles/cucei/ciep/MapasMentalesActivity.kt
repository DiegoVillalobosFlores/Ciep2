package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mobiles.cucei.ciep.R.layout.mapas_mentales_01

class MapasMentalesActivity : AppCompatActivity() {

    private var currentView = mapas_mentales_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapas_mentales_01)
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
}
