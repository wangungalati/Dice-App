package com.mangalism.dice

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
   @Test
   fun numberRange(){
      val dice=Dice(6)
      val diceValue=dice.roll()

      assertTrue("The value is not between 1 and 6",diceValue in 1..6)
   }
}