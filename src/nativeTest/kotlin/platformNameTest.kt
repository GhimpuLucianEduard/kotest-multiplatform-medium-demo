import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PlatformNameTestNative : FunSpec({
    test("platform name should be native") {
        platformName() shouldBe "native"
    }
//  Comment this in for a failed test
//    test("my only purpose is to fail!") {
//        platformName() shouldBe "jvm"
//    }
})