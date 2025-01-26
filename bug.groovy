```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null
  }
  return a + b
}

println myMethod(null, 5) //expect null, get null
println myMethod(5, null) //expect null, get null
println myMethod(null, null) //expect null, get null
println myMethod(5, 5) //expect 10, get 10
println myMethod([1, 2], [3, 4]) //expect [1, 2, 3, 4], get [1, 2, 3, 4]
println myMethod([1, 2], null) // expect null, get java.lang.NullPointerException
```