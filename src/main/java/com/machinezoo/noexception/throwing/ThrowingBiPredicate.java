// Part of NoException: https://noexception.machinezoo.com
package com.machinezoo.noexception.throwing;

import java.util.function.*;
import com.machinezoo.noexception.*;

/**
 * Variation of {@link BiPredicate} that allows throwing checked exceptions.
 * 
 * {@code ThrowingBiPredicate} is usually implemented by a lambda
 * and passed to {@link CheckedExceptionHandler#fromBiPredicate(ThrowingBiPredicate)}.
 * See <a href="https://noexception.machinezoo.com/">NoException tutorial</a>.
 * 
 * @param <T>
 *            See {@link BiPredicate}.
 * @param <U>
 *            See {@link BiPredicate}.
 * @see CheckedExceptionHandler#fromBiPredicate(ThrowingBiPredicate)
 * @see BiPredicate
 */
@FunctionalInterface public interface ThrowingBiPredicate<T, U> {
	/**
	 * Variation of {@link BiPredicate#test(Object, Object)} that allows throwing checked exceptions.
	 * 
	 * @param t,
	 *            See {@link BiPredicate#test(Object, Object)}
	 * @param u
	 *            See {@link BiPredicate#test(Object, Object)}
	 * @return See {@link BiPredicate#test(Object, Object)}
	 * @throws Exception
	 *             Whenever necessary.
	 * @see CheckedExceptionHandler#fromBiPredicate(ThrowingBiPredicate)
	 * @see BiPredicate#test(Object, Object)
	 */
	boolean test(T t, U u) throws Exception;
}
