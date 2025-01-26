# Groovy NullPointerException with Implicit Type Coercion

This example demonstrates a common error in Groovy related to implicit type coercion and null values.  The `myMethod` function aims to safely add two values, but it unexpectedly throws a `NullPointerException` in certain cases.

The problem arises because the `+` operator behaves differently depending on the types of its operands. If either operand is null and the other is a list, the operation will throw a `NullPointerException`. This is often unexpected for developers coming from other languages. 

The solution explains how to make the method more robust by explicitly checking for null values before performing the addition. 