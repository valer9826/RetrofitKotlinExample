package com.cursokotlin.retrofitkotlinexample.presentation.common.util

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by aristidesguimeraorozco on 5/5/18.
 */

fun ImageView.fromUrl(url:String){
    Picasso.get().load(url).into(this)
}