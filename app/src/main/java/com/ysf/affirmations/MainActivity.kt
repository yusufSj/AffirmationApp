package com.ysf.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.ysf.affirmations.adapter.ItemAdapter
import com.ysf.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val datasource=Datasource()
        val myDataSet = datasource.loadAffirmations()
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=ItemAdapter(this,myDataSet)
        recyclerView.setHasFixedSize(true)

    }//onCreate

}//MainActivity