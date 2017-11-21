package mobiles.cucei.ciep

import android.content.Intent
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.datos_numericos_00.*
import kotlinx.android.synthetic.main.datos_numericos_02.*
import kotlinx.android.synthetic.main.datos_numericos_05.*
import kotlinx.android.synthetic.main.datos_numericos_06.*
import kotlinx.android.synthetic.main.datos_numericos_08.*
import kotlinx.android.synthetic.main.datos_numericos_09.*
import kotlinx.android.synthetic.main.datos_numericos_11.*
import kotlinx.android.synthetic.main.datos_numericos_12.*
import mobiles.cucei.ciep.autoevaluaciones.DatosNumericos
import mobiles.cucei.ciep.R.layout.*

class DatosNumericosActivity : AppCompatActivity() {

    private var currentViewId:Int = 0
    private var currentView:View? = null
    private var currentViewList:ArrayList<Int> = ArrayList()

    private var currentAudio:Int = 0
    private val audios:ArrayList<Int> = ArrayList()

    private var mediaPlayer:MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.datos_numericos_01)

        for(cont in 0..28){
            currentViewList.add(datos_numericos_01 + cont)
        }
        for(cont in 0..13){
            audios.add(R.raw.audio01 + cont)
        }


    }

    fun onStart(view: View){
        setContentView(R.layout.datos_numericos_00)
        currentView = LayoutInflater.from(this).inflate(R.layout.datos_numericos_02,null)
        setFrameView(R.layout.datos_numericos_02)

        currentAudio = R.raw.audio02
        datos_numericos_fab.setOnClickListener{
            if(mediaPlayer.isPlaying) {
                mediaPlayer.stop()
            }
            playAudio()
        }
    }

    fun setFrameView(viewId:Int){
        val layout = LayoutInflater.from(this).inflate(viewId,null)
        //val view = layout.findViewById<View>(viewId)
        datos_numericos_content.removeView(currentView)
        datos_numericos_content.addView(layout)

        currentView = layout

        datos_numericos_bottom_navigation.setOnNavigationItemSelectedListener{item -> onOptionsItemSelected(item) }
    }

    fun onClick(view:View){
        if(mediaPlayer.isPlaying){
            mediaPlayer.stop()
        }
        when(view){
            intro_siguiente_datosnumericos2 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_porcentajes
            intro_siguiente_datosnumericos5 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_graficas
            intro_siguiente_datosnumericos8 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_histogramas
            intro_siguiente_datosnumericos11 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_autoevaluacion
            else -> {
                setFrameView(currentViewList[currentViewId+1])
                currentViewId++

                currentAudio++
            }
        }
    }

    fun onClickBack(view: View){
        if(mediaPlayer.isPlaying){
            mediaPlayer.stop()
        }
        when(view){
            intro_anterior_datosnumericos6 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_porcentajes
            intro_anterior_datosnumericos9 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_graficas
            intro_anterior_datosnumericos12 -> datos_numericos_bottom_navigation.selectedItemId = R.id.menu_histogramas

            else -> {
                setFrameView(currentViewList[currentViewId-1])
                currentViewId--

                currentAudio--
            }
        }
    }

    fun onFinish(view: View){
        if(mediaPlayer.isPlaying){
            mediaPlayer.stop()
        }
        finish()
    }

    fun startTest(view: View){
        if(mediaPlayer.isPlaying){
            mediaPlayer.stop()
        }
        val intent = Intent(this, DatosNumericos::class.java)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        when(item?.itemId){
            R.id.menu_porcentajes -> changeNavigation(R.layout.datos_numericos_03,R.raw.audio04)
            R.id.menu_graficas -> changeNavigation(R.layout.datos_numericos_06,R.raw.audio07)
            R.id.menu_histogramas -> changeNavigation(R.layout.datos_numericos_09,R.raw.audio10)
            R.id.menu_autoevaluacion -> changeNavigation(R.layout.datos_numericos_12,R.raw.audio13)
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }

    fun changeNavigation(viewId: Int, audioId: Int){
        currentAudio = audioId

        setFrameView(viewId)

        currentViewId = currentViewList.indexOf(viewId)
    }


    fun playAudio(){
        mediaPlayer = MediaPlayer.create(this,currentAudio)
        mediaPlayer.start()
    }

}
