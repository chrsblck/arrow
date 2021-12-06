// This file was automatically generated from Either.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleEither39

import arrow.*
import arrow.core.*
import arrow.core.coroutines.*
import kotlinx.coroutines.*
import io.kotest.matchers.collections.*
import io.kotest.assertions.*
import io.kotest.matchers.*
import io.kotest.matchers.types.*
import kotlin.coroutines.cancellation.CancellationException
import io.kotest.property.*
import io.kotest.property.arbitrary.*
import arrow.core.test.generators.*

 import arrow.core.*

fun main() {
  Either.Right(12).tap { println("flower") } // Result: prints "flower" and returns: Right(12)
  Either.Left(12).tap { println("flower") }  // Result: Left(12)
}