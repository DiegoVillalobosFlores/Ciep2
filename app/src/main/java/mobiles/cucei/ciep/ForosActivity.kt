package mobiles.cucei.ciep

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
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