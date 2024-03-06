package com.example.demo

object Formula {
    // cond1 = false, cond2 = false -> x
    // cond1 = true , cond2 = false -> x + 1
    // cond1 = false, cond2 = true  -> x * 2
    // cond1 = true , cond2 = true  -> (x + 1) * 2
//    fun f(x: Int, cond1: Boolean, cond2: Boolean): Int {
//        var result = x
//
//        if (cond1) result += 1
//        if (cond2) result *= 2
//
//        return result
//    }

//    fun f(x: Int, cond1: Boolean, cond2: Boolean): Int =
//        if(cond1) {
//            if(cond2) (x + 1) * 2
//            else x + 1
//        } else {
//            if(cond2) x * 2
//            else x
//        }

    fun condAdd(x: Int, cond: Boolean): Int =
        if(cond) x + 1 else x

    fun condMul(x: Int, cond: Boolean): Int =
        if(cond) x * 2 else x

    fun f(x: Int, cond1: Boolean, cond2: Boolean): Int =
        condMul(condAdd(x, cond1), cond2)

    // 2^4
    // 2^2 + 2^2
    fun f2x(cond3: Boolean,
            cond4: Boolean,) {

    }

    fun f2(cond1: Boolean,
           cond2: Boolean,
           cond3: Boolean,
           cond4: Boolean,) {



        f2x(cond3, cond4)

    }
}