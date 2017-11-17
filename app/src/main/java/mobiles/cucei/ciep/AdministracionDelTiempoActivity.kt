package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mobiles.cucei.ciep.R.layout.administracion_del_tiempo_01

class AdministracionDelTiempoActivity : AppCompatActivity() {

    private var currentView = administracion_del_tiempo_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.administracion_del_tiempo_01)
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
