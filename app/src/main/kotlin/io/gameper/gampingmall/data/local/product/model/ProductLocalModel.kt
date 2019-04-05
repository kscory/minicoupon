package io.gameper.gampingmall.data.local.product.model

import java.math.BigDecimal
import java.util.*

data class ProductLocalModel(

    val skuCode: String,
    val productCode: String,
    val productName: String,
    val productType: String,
    val status: String,
    val brandName: String,
    val description: String,
    val discountRate: Float,
    val giftVendor: String,
    val imageUrl: String,
    val price: BigDecimal,
    val sellingPrice: BigDecimal,
    val priceCurrency: String,
    val priceSymbol: String,
    val priceSymbolKo: String,
    val expiredAt: Date
)