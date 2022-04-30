package com.example.mad_ind05_goertemiller_nicholas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var itemImgPhoto : ImageView
    private lateinit var stateNickname : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_state)


        val actionBar = supportActionBar

        actionBar!!.title = "test"



        itemImgPhoto = findViewById(R.id.img_pic)

        var photo : Int = intent.getIntExtra("pic", 0)
        itemImgPhoto.setImageResource(photo)

        stateNickname = findViewById(R.id.stateNick_name)
        var nickName : String = intent.getStringExtra("nickName").toString()
        stateNickname.setText(nickName)


    }
}