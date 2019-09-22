package shop

class ShoppingCart {

    private val productList = mutableListOf<Product>()
    val totalAmount
        get() = productList.sumByDouble { it.price }

    fun addProduct(product : Product){
        productList.add(product)
    }
}