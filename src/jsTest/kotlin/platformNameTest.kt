import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PlatformNameTestJs : FunSpec({
    test("platform name should be js") {
        platformName() shouldBe "js"
    }
})