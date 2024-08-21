package com.example.fashionoutfitcombinator.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fashionoutfitcombinator.data.model.ClothingItem
import com.example.fashionoutfitcombinator.data.repository.OutfitRepository

class OutfitViewModel : ViewModel() {

    private val outfitRepository = OutfitRepository()

    private val _clothingItems = MutableLiveData<List<ClothingItem>>()
    val clothingItems: LiveData<List<ClothingItem>> get() = _clothingItems

    private val _selectedOutfit = MutableLiveData<List<ClothingItem>>()
    val selectedOutfit: LiveData<List<ClothingItem>> get() = _selectedOutfit

    fun loadClothingItems() {
        _clothingItems.value = outfitRepository.getAvailableClothingItems()
    }

    fun selectOutfit(items: List<ClothingItem>) {
        _selectedOutfit.value = items
    }
}
