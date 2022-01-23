import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldNotBe

class PlatformNameTest : FunSpec({
    test("platform name should be non empty") {
        platformName() shouldNotBe ""
    }
})