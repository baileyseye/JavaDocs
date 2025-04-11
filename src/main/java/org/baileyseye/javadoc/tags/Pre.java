package org.baileyseye.javadoc.tags;

import org.baileyseye.javadoc.HyperLinks;

/**
 * Тег с помощью которого можно создать {@linkplain HyperLinks#snippet() сниппет кода}
 * <br>
 * Для реализации необходимо использовать тег {@code} внутри pre
 */
public class Pre {

    /**
     * Ниже представлен рандом сниппет рандом кода, поддерживающий отображение как в обычном коде
     * <pre>
     *     {@code
     *     private final CircuitBreakerRegistry registry; // можно оставить коммент
     *     private final ConcurrentMap<Class<?>, Boolean> cache = new ConcurrentHashMap<>();
     *
     *
     *     @Pointcut("within(ru.your.project.*.service..*)") // строки тоже выделяются
     *     public void servicePackagePointcut() {}
     *
     *     private Object executeWithCircuitBreaker(ProceedingJoinPoint pjp) throws Throwable {
     *         CircuitBreaker circuitBreaker = registry.circuitBreaker("defaultCircuitBreaker");
     *
     *         return circuitBreaker.executeCallable(() -> {
     *             try {
     *                 return pjp.proceed();
     *             } catch (Throwable e) {
     *                 throw new RuntimeException(e);
     *             }
     *         });
     *     }
     *     }
     * </pre>
     */
    public void createSnippet() {

    }
}
