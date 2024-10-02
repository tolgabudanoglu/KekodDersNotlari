package com.example.appnavigation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.navigation.findNavController

class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
):LinearLayout(context,attrs,defStyle) {

    private var textViewTittle : TextView
    private var textViewDescription : TextView

    init {
        orientation = VERTICAL
        LayoutInflater.from(context).inflate(R.layout.view_custom,this,true)

        textViewTittle = findViewById(R.id.textViewTittle)
        textViewDescription = findViewById(R.id.textViewDesc)

        textViewTittle.text = "custom view tittle"
        textViewDescription.text = "custom desc"

        //özelleştirebilir
        attrs?.let {
//            val typedArray = context.obtainStyledAttributes(it,R.styleable.CustomView,0,0)
//            val tittle = typedArray.getString(R.styleable.CustomView_tittleText)
//            val description = typedArray.getString(R.styleable.Customview_descriptionText)

//            tittle.let { textViewTittle.text = it }
//            description.let { textViewDescription.text = it }

//            typedArray.recycle()
        }
        val navController = findNavController()
    }
}