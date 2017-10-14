package mobiles.cucei.ciep

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.guias.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guias)
    }

    fun onClick(view:View){
        var intent = Intent()
        when(view){
            guia1 -> intent = Intent(this,FrancesActivity::class.java)
            guia3 -> intent = Intent(this,AdministracionDelTiempoActivity::class.java)
            guia5 -> intent = Intent(this,EstresActivity::class.java)
            guia6 -> intent = Intent(this,MapasMentalesActivity::class.java)
            guia7 -> intent = Intent(this,InglesActivity::class.java)
            guia8 -> intent = Intent(this,DatosNumericosActivity::class.java)
            guia9 -> intent = Intent(this,MatematicasActivity::class.java)
            guia10 -> intent = Intent(this,HabilidadesLecturaActivity::class.java)
            guia11 -> intent = Intent(this,ForosActivity::class.java)
            guia12 -> intent = Intent(this,ExcelActivity::class.java)
        }
        startActivity(intent)
    }

}
