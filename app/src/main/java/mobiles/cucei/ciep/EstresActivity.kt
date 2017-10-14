package mobiles.cucei.ciep

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import mobiles.cucei.ciep.R.layout.estres_01

class EstresActivity : AppCompatActivity() {

    private val viewsStres:ArrayList<Int> = ArrayList()
    private var currentView:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.estres_01)

        for(cont in 0..27){
            viewsStres.add(estres_01+cont)
        }
    }

    fun onClick(view: View){
        setContentView(viewsStres[currentView+1])
        currentView++
    }

    fun onClickBack(view: View){
        setContentView(viewsStres[currentView-1])
        currentView--
    }

    fun onFinish(view: View){
        finish()
    }
}
