package mobiles.cucei.ciep

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_ficha_aldiko_fragment.*
import kotlinx.android.synthetic.main.importancia_del_ingles_04.*
import mobiles.cucei.ciep.R.layout.importancia_del_ingles_01

class InglesActivity : AppCompatActivity() {

    private var currentView = importancia_del_ingles_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.importancia_del_ingles_01)

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

    fun showAppInfo(view:View){
        when(view){
            imagen1_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_aldiko)
            imagen2_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_ezpdf)
            imagen3_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_ibooks)
            imagen4_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_kindle)
            imagen5_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_binaurality)
            imagen6_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_wilingua)
            imagen7_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_duolingoi)
            imagen8_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_project)
            imagen9_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_voxy)
            imagen10_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_mindsnacks)
            imagen11_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_chumkee)
            imagen12_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_mylingo)
            imagen13_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_speaking)
            imagen14_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_busuu)
            imagen15_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_babbel)
            imagen16_pantalla4_importanciadelingles -> displayInfo(R.drawable.ficha_internet_archive)
        }
    }

    private fun displayInfo(drawable: Int){
        val image = ImageView(this)
        image.setImageDrawable(ContextCompat.getDrawable(this,drawable))
        image.setBackgroundColor(ContextCompat.getColor(this,R.color.White))
        val alertDialog = AlertDialog.Builder(this)
                .setView(image)
                .create()
        alertDialog.show()
    }
}
