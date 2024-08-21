package com.example.fashionoutfitcombinator.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.fashionoutfitcombinator.R
import com.example.fashionoutfitcombinator.viewmodel.OutfitViewModel

class MainActivity : AppCompatActivity() {

    private val outfitViewModel: OutfitViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        outfitViewModel.clothingItems.observe(this, Observer { items ->
            // Update UI to show available clothing items
        })

        outfitViewModel.selectedOutfit.observe(this, Observer { outfit ->
            // Update UI to show the selected outfit combination
        })

        outfitViewModel.loadClothingItems()
    }
}
