package com.example.github.repositories.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

object DataBindingUtil {

    @BindingAdapter("setImg")
    fun setImage(imageView: ImageView, url: String) {
        Picasso.get().load(url).into(imageView)
    }

}