internal fun main() {

    val website = Website.Builder()
        .setName("Test")
        .setCms(Cms.Drupal)
        .setPrice(100)
        .build()

    println(website)
}
