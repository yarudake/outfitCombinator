package com.example.fashionoutfitcombinator.data.model

data class ClothingItem(
    val id: Int,
    val name: String,
    val type: ClothingType,
    val imageUrl: String
)

enum class ClothingType {
    TOP, BOTTOM, SHOES, ACCESSORY
}
