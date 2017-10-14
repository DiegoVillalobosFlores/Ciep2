package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mobiles.cucei.ciep.R.layout.administracion_del_tiempo_01

class AdministracionDelTiempoActivity : AppCompatActivity() {

    private val viewsADT:ArrayList<Int> = ArrayList()
    private var currentView = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.administracion_del_tiempo_01)

        for(cont in 0..22){
            viewsADT.add(administracion_del_tiempo_01+cont)
        }
    }

    fun onClick(view: View){
        setContentView(viewsADT[currentView+1])
        currentView++
    }

    fun onClickBack(view: View){
        setContentView(viewsADT[currentView-1])
        currentView--
    }

    fun onFinish(view: View){
        finish()
    }

}
