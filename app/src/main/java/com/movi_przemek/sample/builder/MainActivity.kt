package com.movi_przemek.sample.builder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.movi_przemek.sample.builder.house.FlyConnection
import com.movi_przemek.sample.builder.house.House

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val house: House = House.Builder()
            .doors("doors")
            .floors("floors")
            .garage("garage")
            .rooms("rooms")
            .windows("windows")
            .walls("walls")
            .build()

        val flyConnection = FlyConnection.Builder()
            .from("Poland")
            .to("Paris")
            .delayed(false)
            .price(1500)
            .build()

        flyConnection.toString()
    }
}
