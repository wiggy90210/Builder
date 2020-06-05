package com.movi_przemek.sample.builder.house

class FlyConnection private constructor(
    val from: String,
    val to: String,
    var delayed: Boolean,
    var price: Int
) {
    data class Builder(
        var from: String = "",
        var to: String = "",
        var delayed: Boolean = false,
        var price: Int = 0
    ) {
        fun from(from: String) = apply { this.from = from }
        fun to(to: String) = apply { this.to = to }
        fun delayed(delayed: Boolean) = apply { this.delayed = delayed }
        fun price(price: Int) = apply { this.price = price }

        fun build() = FlyConnection(from, to, delayed, price)
    }

    override fun toString(): String {
        return "FlyConnection(from='$from',\n to='$to',\n delayed=$delayed,\n price=$price)"
    }
}