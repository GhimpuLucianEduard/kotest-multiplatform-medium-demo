import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PlatformNameTestJvm : FunSpec({
    test("platform name should be jvm") {
        platformName() shouldBe "jvm"
    }
})