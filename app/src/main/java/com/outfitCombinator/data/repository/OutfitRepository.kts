package com.example.fashionoutfitcombinator.data.repository

import com.example.fashionoutfitcombinator.data.model.ClothingItem
import com.example.fashionoutfitcombinator.data.model.ClothingType

class OutfitRepository {

    // Simulate fetching data from a database or API
    fun getAvailableClothingItems(): List<ClothingItem> {
        return listOf(
            ClothingItem(1, "T-Shirt", ClothingType.TOP, "url_to_image_1"),
            ClothingItem(2, "Jeans", ClothingType.BOTTOM, "url_to_image_2"),
            ClothingItem(3, "Sneakers", ClothingType.SHOES, "url_to_image_3"),
            ClothingItem(4, "Watch", ClothingType.ACCESSORY, "url_to_image_4")
        )
    }
}
