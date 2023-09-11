package com.example.individual_10

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {
    var isFoldable: Boolean = false

      override fun switchOn() {
        if (!isFoldable) {
            isScreenLightOn = true
        }
    }

    fun openPhone() {
        isFoldable = true
    }
    fun closePhone(){
        isFoldable = false
    }
}