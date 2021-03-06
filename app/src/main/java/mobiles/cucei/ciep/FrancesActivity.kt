package mobiles.cucei.ciep

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.frances_10.*
import kotlinx.android.synthetic.main.frances_12.*
import kotlinx.android.synthetic.main.frances_15.*
import kotlinx.android.synthetic.main.frances_16.*
import kotlinx.android.synthetic.main.frances_18.*
import kotlinx.android.synthetic.main.frances_20.*
import mobiles.cucei.ciep.R.layout.frances_01

class FrancesActivity : AppCompatActivity() {

    private var currentView = frances_01
    private var mediaPlayer:MediaPlayer = MediaPlayer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.frances_01)

    }

    fun onClick(view: View){
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        when(view){
            champagne -> playAudio(R.raw.a4)
            bocina1_pantalla10 -> playAudio(R.raw.a1)
            bocina2_pantalla10 -> playAudio(R.raw.a3)
            bocina3_pantalla10 -> playAudio(R.raw.a2)
            bocina1_pantalla12 -> playAudio(R.raw.a5)
            bocina2_pantalla12 -> playAudio(R.raw.a6)
            bocina3_pantalla12 -> playAudio(R.raw.a7)
            bocina4_pantalla12 -> playAudio(R.raw.a8)
            bocina1_pantalla15 -> playAudio(R.raw.a9)
            bocina2_pantalla15 -> playAudio(R.raw.a10)
            bocina1_pantalla16 -> playAudio(R.raw.a11)
            bocina2_pantalla16 -> playAudio(R.raw.a12)
            bocina3_pantalla16 -> playAudio(R.raw.a13)
            bocina4_pantalla16 -> playAudio(R.raw.a14)
            bocina5_pantalla16 -> playAudio(R.raw.a12)
            bocina6_pantalla16 -> playAudio(R.raw.a15)
            bocina1_pantalla18 -> playAudio(R.raw.a17)
            bocina1_pantalla20 -> playAudio(R.raw.a17)
            bocina2_pantalla18 -> playMultipleAudios(R.raw.a18,R.raw.a13)
            bocina3_pantalla18 -> playMultipleAudios(R.raw.a19,R.raw.a13)
            bocina2_pantalla20 -> playMultipleAudios(R.raw.a18,R.raw.a15)
            bocina3_pantalla20 -> playMultipleAudios(R.raw.a19,R.raw.a15)

            else -> {
                currentView++
                setContentView(currentView)
            }
        }
    }

    fun onClickBack(view: View){
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        currentView--
        setContentView(currentView)
    }

    fun onFinish(view: View){
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        finish()
    }

    fun playAudio(audio:Int){
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        mediaPlayer = MediaPlayer.create(this,audio)
        mediaPlayer.start()
    }

    fun playMultipleAudios(firstAudio:Int,secondAudio:Int){
        if(mediaPlayer.isPlaying) mediaPlayer.stop()
        mediaPlayer = MediaPlayer.create(this,firstAudio)
        mediaPlayer.start()
        mediaPlayer.setOnCompletionListener { mediaPlayer = MediaPlayer.create(this,secondAudio)
            mediaPlayer.start()
        }
    }
}
