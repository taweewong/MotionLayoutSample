package com.taweewong.motionlayoutpoc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.taweewong.motionlayoutpoc.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerViewTest.layoutManager = LinearLayoutManager(this)
        recyclerViewTest.adapter = MyAdapter(
            arrayListOf(
                "Hello",
                "I'm a shit",
                "this is what I like",
                "Just kill me now",
                "SO hungry",
                "Brishtish people be like. \"Fank you\""
            )
        )
    }
}
