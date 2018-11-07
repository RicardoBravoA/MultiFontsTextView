package com.rba.multifontstextview

import android.graphics.Typeface
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import com.rba.multifontstextviewlibrary.MultiFontsTextViewItemModel
import com.rba.multifontstextviewlibrary.MultiFontsTextViewModel

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private var ANDINA: Typeface? = null
    private var FRAGUA: Typeface? = null
    private val COLOR_1: String = "#35f2ed"
    private val COLOR_2: String = "#373c67"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        ANDINA = ResourcesCompat.getFont(this, R.font.andina_free)
        FRAGUA = ResourcesCompat.getFont(this, R.font.fragua_light_italic)

        tv_second.setText(getDataSecond())
        tv_third.setText(getDataThird())
    }

    fun getDataSecond(): MultiFontsTextViewModel {

        val multiFontsTextViewModel = MultiFontsTextViewModel()
        multiFontsTextViewModel.text = "Lorem ipsum dolor sit amet consectetur adipiscing"

        val list = ArrayList<MultiFontsTextViewItemModel>()

        val multiFontsTextViewItemModel1 = MultiFontsTextViewItemModel()
        multiFontsTextViewItemModel1.font = ANDINA
        multiFontsTextViewItemModel1.color = COLOR_1
        multiFontsTextViewItemModel1.words = "Lorem ipsum dolor"
        list.add(multiFontsTextViewItemModel1)

        val multiFontsTextViewItemModel2 = MultiFontsTextViewItemModel()
        multiFontsTextViewItemModel2.font = FRAGUA
        multiFontsTextViewItemModel2.color = COLOR_2
        multiFontsTextViewItemModel2.words = "sit amet consectetur adipiscing"
        list.add(multiFontsTextViewItemModel2)

        multiFontsTextViewModel.list = list

        return multiFontsTextViewModel
    }

    fun getDataThird(): MultiFontsTextViewModel {

        val multiFontsTextViewModel = MultiFontsTextViewModel()
        multiFontsTextViewModel.text = "Lorem ipsum dolor sit amet consectetur adipiscing"

        val list = ArrayList<MultiFontsTextViewItemModel>()

        val multiFontsTextViewItemModel1 = MultiFontsTextViewItemModel()
        multiFontsTextViewItemModel1.font = ANDINA
        multiFontsTextViewItemModel1.color = COLOR_1
        multiFontsTextViewItemModel1.words = "Lorem"
        list.add(multiFontsTextViewItemModel1)

        val multiFontsTextViewItemModel2 = MultiFontsTextViewItemModel()
        multiFontsTextViewItemModel2.font = FRAGUA
        multiFontsTextViewItemModel2.color = COLOR_2
        multiFontsTextViewItemModel2.words = "ipsum"
        list.add(multiFontsTextViewItemModel2)

        val multiFontsTextViewItemModel3 = MultiFontsTextViewItemModel()
        multiFontsTextViewItemModel3.font = ANDINA
        multiFontsTextViewItemModel3.color = COLOR_1
        multiFontsTextViewItemModel3.words = "dolor"
        list.add(multiFontsTextViewItemModel3)

        multiFontsTextViewModel.list = list

        return multiFontsTextViewModel
    }

}
