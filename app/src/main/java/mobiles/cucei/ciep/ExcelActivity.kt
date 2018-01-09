package mobiles.cucei.ciep

import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.widget.ExpandableListView
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
        excel_content.removeAllViews()
        excel_content.addView(layout)

        currentFrameView = layout
    }

    fun initLayout(){

        setFrameView(R.layout.excel_avanzado_03)
        val headers = listOf("Guía de aprendizaje",
                "Funciones de Texto",
                "Funciones Lógicas",
                "Funciones Matemáticas y trigonométricas",
                "Referencias a celdas y rangos",
                "Filtros de datos",
                "Gráficos")

        val guiaList = listOf("introducción","Objetivos","Actividad")
        val textoList = listOf("Concatenar","Encontrar")
        val logicList = listOf("Si","O","Y")
        val mathList = listOf("Redondear","Sumar Si", "Residuo", "Aleatorio Entre", "Contar Si","Promedio","Moda","Mediana")
        val refList = listOf("Estilo de referencia A1","Diferencia entre referencias relativas y absolutas")
        val filterList = listOf("Rápido","Texto o número específicos","Color")
        val graphList = listOf("Creación","Diseño y estilos","Títulos o etiquetas de datos")

        val childrenMap = HashMap<String,List<String>>()
        childrenMap.put(headers[0],guiaList)
        childrenMap.put(headers[1],textoList)
        childrenMap.put(headers[2],logicList)
        childrenMap.put(headers[3],mathList)
        childrenMap.put(headers[4],refList)
        childrenMap.put(headers[5],filterList)
        childrenMap.put(headers[6],graphList)

        val expandableListAdapter = ExpandableListAdapter(this,headers,childrenMap)

        setSupportActionBar(toolbar)

        val icon: Drawable = ContextCompat.getDrawable(this,R.drawable.ic_menu_black_24dp)
        icon.setColorFilter(ContextCompat.getColor(this,R.color.Green),PorterDuff.Mode.SRC_ATOP)
        val ab:ActionBar? = supportActionBar
        ab?.title = "Introducción"
        ab?.setHomeAsUpIndicator(icon)
        ab?.setDisplayHomeAsUpEnabled(true)
        nav_view.setNavigationItemSelectedListener { item: MenuItem -> setupDrawerContent(item)  }
        excel_expandable_list.setAdapter(expandableListAdapter)
        for (cont in 0..6){
            excel_expandable_list.expandGroup(cont)
        }
        excel_expandable_list.setOnChildClickListener(object : ExpandableListView.OnChildClickListener{
            override fun onChildClick(p0: ExpandableListView?, p1: View?, p2: Int, p3: Int, p4: Long): Boolean {
                drawer_layout.closeDrawers()
                when(p2){
                    0 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_03,"Introducción")
                        1 -> childSelected(R.layout.excel_avanzado_04,"Objetivos")
                        2 -> childSelected(R.layout.excel_avanzado_05,"Actividad")
                    }
                    1 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_06,"Concatenar")
                        1 -> childSelected(R.layout.excel_avanzado_07,"Encontrar")
                    }
                    2 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_08,"Si")
                        1 -> childSelected(R.layout.excel_avanzado_09,"O")
                        2 -> childSelected(R.layout.excel_avanzado_10,"Y")
                    }
                    3 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_11,"Redondear")
                        1 -> childSelected(R.layout.excel_avanzado_12,"Sumar si")
                        2 -> childSelected(R.layout.excel_avanzado_13,"Residuo")
                        3 -> childSelected(R.layout.excel_avanzado_14,"Aleatorio Entre")
                        4 -> childSelected(R.layout.excel_avanzado_15,"Contar si")
                        5 -> childSelected(R.layout.excel_avanzado_16,"Promedio")
                        6 -> childSelected(R.layout.excel_avanzado_17,"Moda")
                        7 -> childSelected(R.layout.excel_avanzado_18,"Mediana")
                    }
                    4 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_19,"Estilo de referencia A1")
                        1 -> childSelected(R.layout.excel_avanzado_20,"Diferencias entre referencias relativas y absolutas")
                    }
                    5 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_21,"Rápido")
                        1 -> childSelected(R.layout.excel_avanzado_22,"Texto o números específicos")
                        2 -> childSelected(R.layout.excel_avanzado_23,"Color")
                    }
                    6 -> when(p3){
                        0 -> childSelected(R.layout.excel_avanzado_24,"Creación")
                        1 -> childSelected(R.layout.excel_avanzado_25,"Diseño y estilos")
                        2 -> childSelected(R.layout.excel_avanzado_26,"Títulos o etiquetas de datos")
                    }
                }
                return true
            }
        })
    }

    fun childSelected(layout:Int,title:String){
        setFrameView(layout)
        supportActionBar?.title = title
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
        Log.wtf("LIST",item?.title.toString())
        item?.isChecked = true
        when(item?.title){
            "Introducción" -> setFrameView(R.layout.excel_avanzado_02)
            "Texto" -> setFrameView(R.layout.excel_avanzado_04)
            "Salir" -> finish()
        }
        drawer_layout.closeDrawers()
        return true
    }
}