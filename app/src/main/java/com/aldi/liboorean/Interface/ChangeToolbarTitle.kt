package com.aldi.liboorean.Interface

import android.graphics.drawable.Drawable
import android.view.View

interface ChangeToolbarTitle{

    fun updateTitle(title: String)
    fun toolbarAction(onClickListener: View.OnClickListener)
    fun showToolbar(show: Boolean)
}