# Scala by Example, chapter 9

## ISort.scala

* Exercise 9.1.1 - provide missing function `insert`
* My code is OK, and it agrees with what Martin Odersky shows
in the following text explaining the real List implementation using case classes. So we can submit this solution.

## MyList.scala

* Exercise 9.2.1 Design a tail-recursive version of length .
* The code works, and it even works with the additional `@tailrec` notation.
* However, it is not very elegant, and I had to add the `soFar` parameter to the function call,
so it's not very nice. Of course, you could hide it and not show the `@tailrec` implementation.
I would say, expert commentary is welcome here. Because on the other hand, maybe it is the right way to go.


