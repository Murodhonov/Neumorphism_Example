package com.example.neumorphicmdesign

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View.OnTouchListener
import androidx.appcompat.app.AppCompatActivity
import soup.neumorphism.NeumorphCardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<NeumorphCardView>(R.id.card_rectangle).setOnTouchListener(OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    findViewById<NeumorphCardView>(R.id.card_rectangle).setShapeType(1)
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    findViewById<NeumorphCardView>(R.id.card_rectangle).setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        findViewById<NeumorphCardView>(R.id.card_oval).setOnTouchListener(OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    findViewById<NeumorphCardView>(R.id.card_oval).setShapeType(1)
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    findViewById<NeumorphCardView>(R.id.card_oval).setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })

        findViewById<NeumorphCardView>(R.id.card_rectangle2).setOnTouchListener(OnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    findViewById<NeumorphCardView>(R.id.card_rectangle2).setShapeType(1)
                    return@OnTouchListener true
                }
                MotionEvent.ACTION_UP -> {
                    findViewById<NeumorphCardView>(R.id.card_rectangle2).setShapeType(0)
                    return@OnTouchListener true
                }
            }
            false
        })


    }
}