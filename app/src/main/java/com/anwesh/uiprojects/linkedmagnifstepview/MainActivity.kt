package com.anwesh.uiprojects.linkedmagnifstepview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.magnifstepview.MagnifStepView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MagnifStepView.create(this)
    }
}
