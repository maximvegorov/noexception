package com.machinezoo.noexception.throwing;

@FunctionalInterface public interface ThrowingLongUnaryOperator {
    long applyAsLong(long operand) throws Exception;
}
