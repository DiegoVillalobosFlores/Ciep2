package mobiles.cucei.ciep

import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.excel_avanzado_02.*
import mobiles.cucei.ciep.R.layout.excel_avanzado_01
import mobiles.cucei.ciep.adapters.ExpandableListAdapter

/**
 * Created by deimi on 10/13/2017.
 */
class ExcelActivity : AppCompatActivity() {

    private var currentView = excel_avanzado_01
    private var currentFrameView:View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.excel_avanzado_01)

    }

    fun setFrameView(viewId:Int){
        val layout = LayoutInflater.from(this).inflate(viewId,null)
        //val view = layout.findViewById<View>(viewId)
        excel_content.removeView(currentFrameView)
        excel_content.addView(layout)

        currentFrameView = layout
    }

    fun initLayout(){

        val headers = listOf("Texto","Lógicas","Matemáticas y trigonométricas")

        val textoList = listOf("Concatenar","Encontrar")
        val logicList = listOf("Si","O","Y")
        val mathList = listOf("Redondear","Sumar Si", "Residuo", "Aleatorio Entre", "Contar Si","Promedio","Moda","Mediana")

        val childrenMap = HashMap<String,List<String>>()
        childrenMap.put(headers[0],textoList)
        childrenMap.put(headers[1],logicList)
        childrenMap.put(headers[2],mathList)

        val expandableListAdapter = ExpandableListAdapter(this,headers,childrenMap)

        setSupportActionBar(toolbar)
        val ab:ActionBar? = supportActionBar
        val icon: Drawable = ContextCompat.getDrawable(this,R.drawable.ic_menu_black_24dp)
        icon.setColorFilter(ContextCompat.getColor(this,R.color.Green),PorterDuff.Mode.SRC_ATOP)
        ab?.title = "Introducción"
        ab?.setHomeAsUpIndicator(icon)
        ab?.setDisplayHomeAsUpEnabled(true)
        nav_view.setNavigationItemSelectedListener { item: MenuItem -> setupDrawerContent(item)  }
        excel_expandable_list.setAdapter(expandableListAdapter)
        excel_expandable_list.expandGroup(0)
        excel_expandable_list.expandGroup(1)
        excel_expandable_list.expandGroup(2)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home -> drawer_layout.openDrawer(Gravity.START)
        }
        return super.onOptionsItemSelected(item)
    }

    fun onClick(view: View){
        currentView++
        setContentView(currentView)
        if(currentView == R.layout.excel_avanzado_02) initLayout()
    }

    fun onClickBack(view: View){
        currentView--
        setContentView(currentView)
    }

    fun onFinish(view: View){
        finish()
    }

    fun setupDrawerContent(item: MenuItem?): Boolean{
        item?.setChecked(true)
        when(item?.title){
            "Introducción" -> setFrameView(R.layout.excel_avanzado_02)
            "Texto" -> setFrameView(R.layout.excel_avanzado_03)
            "Salir" -> finish()
        }
        drawer_layout.closeDrawers()
        return true
    }
}