package arrow.core

import io.kotest.assertions.throwables.shouldThrowAny
import io.kotest.matchers.shouldBe
import kotlin.test.Test
import kotlinx.coroutines.test.runTest

class NonFatalJvmTest {
  val fatals: List<Throwable> =
    listOf(
      InterruptedException(),
      StackOverflowError(),
      OutOfMemoryError(),
      LinkageError(),
      object : VirtualMachineError() {
      },
    )

  @Test fun testFatalsUsingInvoke() = runTest {
    fatals.forEach {
      NonFatal(it) shouldBe false
    }
  }
  
  @Test fun testFatalsUsingThrowableNonFatalOrThrow() = runTest {
    fatals.forEach {
      shouldThrowAny {
        it.nonFatalOrThrow()
      }
    }
  }
}
