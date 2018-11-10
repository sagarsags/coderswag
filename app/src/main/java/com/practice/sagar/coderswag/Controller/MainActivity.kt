package com.practice.sagar.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.practice.sagar.coderswag.Adapters.CategoryAdapter
import com.practice.sagar.coderswag.Model.Category
import com.practice.sagar.coderswag.R
import com.practice.sagar.coderswag.Services.DataServices
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter1 : CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter1= CategoryAdapter(this,DataServices.catogaries)
        categoryListView.adapter=adapter1
    }
}
