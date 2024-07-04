/**
 * Сейчас код конструктора вызывает предупреждение о том, что конструктор не является приватным полностью и доступен из
 * метода copy(). Это исправят в версии Kotlin 2.0.20
 */
internal data class Website private constructor(
    private val name: String,
    private val cms: Cms,
    private val price: Int
) {

    override fun toString(): String {
        return "Website(name='$name', cms=$cms, price=$price)"
    }

    class Builder {
        private var name: String = "Unnamed"
        private var cms: Cms = Cms.Wordpress
        private var price: Int = 0
        fun setName(name: String) = apply { this.name = name }
        fun setCms(cms: Cms) = apply { this.cms = cms }
        fun setPrice(price: Int) = apply { this.price = price }
        fun build() = Website(name, cms, price)
    }
}

internal sealed class Cms {
    data object Wordpress : Cms()
    data object Joomla : Cms()
    data object Drupal : Cms()
    data object Opencart : Cms()
    data object Shopware : Cms()
}