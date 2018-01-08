package mobiles.cucei.ciep.adapters

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import mobiles.cucei.ciep.R

/**
 * Created by deimi on 12/6/2017.
 */
class ExpandableListAdapter(val context:Context, val headerList : List<String>, val childrenList: HashMap<String,List<String>> ) : BaseExpandableListAdapter(){
    override fun getGroup(groupPosition: Int): Any {
        return headerList[groupPosition]
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hasStableIds(): Boolean {
        return false
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGroupView(groupPosition: Int, isExpanded: Boolean, convertView: View?, parent: ViewGroup?): View {
        val headerTitle = getGroup(groupPosition) as String
        val view:View = LayoutInflater.from(context).inflate(R.layout.list_header,parent,false)

        val listHeaderText = view.findViewById<TextView>(R.id.list_header_text) as TextView

        listHeaderText.setTextColor(ContextCompat.getColor(context,R.color.Green))
        listHeaderText.text = headerTitle

        return view

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return childrenList[headerList[groupPosition]]!!.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return childrenList[headerList[groupPosition]]!![childPosition]
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean, convertView: View?, parent: ViewGroup?): View {
        val childtext = getChild(groupPosition,childPosition) as String

        val view:View = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)

        val lisItemText = view.findViewById<TextView>(R.id.list_item_text) as TextView
        lisItemText.text = childtext

        return view

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getGroupCount(): Int {
        return headerList.size
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}