// Scala Recursive Fibonacci

def fib(n: Long): Long = {
  if (n <= 1) n
  else fib(n - 1) + fib(n - 2)
}


@main
def Hello(): Unit = {
  val n: Long = 45
  println(fib(n))
}

// Via me