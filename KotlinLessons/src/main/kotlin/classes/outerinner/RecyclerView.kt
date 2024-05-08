package classes.outerinner

class RecyclerView {

    val outerNmae:String = "RecyclerView"
    class ViewHolder{
        val nestedName:String = "ViewHolder"
    }
}

class RecyclerView2 {

    val outerNmae:String = "RecyclerView2"
    inner class ViewHolder{
        val nestedName:String = "ViewHolder2"

        fun getOuterName():String{
            return outerNmae
        }
    }
}

fun main() {
    val recyclerView = RecyclerView()
    val viewHolder = RecyclerView.ViewHolder()


    val recyclerView2 = RecyclerView2()
    val viewHolder2 = RecyclerView2().ViewHolder()
}