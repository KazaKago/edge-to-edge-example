package com.kazakago.edgetoedge.material3.androidview

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updateLayoutParams
import androidx.core.view.updatePadding
import com.kazakago.edgetoedge.material3.androidview.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        binding.recyclerView.adapter = RecyclerViewAdapter()

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, windowInsets ->
            val systemBarsInsets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
            binding.appBarLayout.updatePadding(
                top = systemBarsInsets.top,
                left = systemBarsInsets.left,
                right = systemBarsInsets.right,
            )
            binding.recyclerView.updatePadding(
                left = systemBarsInsets.left,
                bottom = systemBarsInsets.bottom,
                right = systemBarsInsets.right,
            )
            binding.floatingActionButton.updateLayoutParams<ViewGroup.MarginLayoutParams> {
                leftMargin = systemBarsInsets.left
                bottomMargin = systemBarsInsets.bottom + (16 * resources.displayMetrics.density).toInt()
                rightMargin = systemBarsInsets.right + (16 * resources.displayMetrics.density).toInt()
            }
            WindowInsetsCompat.CONSUMED
        }
    }
}
