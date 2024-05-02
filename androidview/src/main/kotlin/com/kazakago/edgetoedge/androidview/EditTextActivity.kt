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
            binding.appBarLayout.updatePadding(
                top = systemBarsInsets.top,
                left = systemBarsInsets.left,
                right = systemBarsInsets.right,
            )
            binding.contentContainer.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                bottomMargin = systemBarsInsets.bottom
                leftMargin = systemBarsInsets.left
                rightMargin = systemBarsInsets.right
            }
            WindowInsetsCompat.CONSUMED
        }
    }
}
