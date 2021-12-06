// This file was automatically generated from Validated.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleValidated03

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

import arrow.core.Validated

fun main() {
  Validated.Valid(12).tapInvalid { println("flower") } // Result: Valid(12)
  Validated.Invalid(12).tapInvalid { println("flower") }  // Result: prints "flower" and returns: Invalid(12)
}