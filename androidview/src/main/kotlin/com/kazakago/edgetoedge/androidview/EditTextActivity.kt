package com.kazakago.edgetoedge.androidview

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import com.kazakago.edgetoedge.androidview.databinding.ActivityEditTextBinding

class EditTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityEditTextBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val systemBarsInsets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            val imeInsets = windowInsets.getInsets(WindowInsetsCompat.Type.ime())
            binding.appBarLayout.updatePadding(
                top = systemBarsInsets.top,
                left = systemBarsInsets.left,
                right = systemBarsInsets.right,
            )
            val systemBarsInsetBottom = if (imeInsets.bottom > 0) 0 else systemBarsInsets.bottom
            binding.contentContainer.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                bottomMargin = systemBarsInsetBottom + imeInsets.bottom
                leftMargin = systemBarsInsets.left + imeInsets.left
                rightMargin = systemBarsInsets.right + imeInsets.right
            }
            WindowInsetsCompat.CONSUMED
        }
    }
}
