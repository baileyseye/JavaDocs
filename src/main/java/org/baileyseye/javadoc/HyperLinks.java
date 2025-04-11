package org.baileyseye.javadoc;

import org.baileyseye.javadoc.tags.LinkPlain;
import org.baileyseye.javadoc.tags.Pre;

/**
 * Оформление гиперссылок в джавадоке
 */
public class HyperLinks {

    static final String KEKE = "keke value";

    /**
     * {@linkplain Class}
     *
     * <br>
     *
     * {@link Class}
     *
     * <br>
     *
     * {@linkplain Class clazz 123}
     *
     * <br>
     *
     * {@link Class clazz 123}
     *
     * <br>
     *
     * <a href="https://imgur.com/a/LTWcyCx">гиперссылка на картинку</a>
     *
     * <br>
     *
     * <a href="https://imgur.com/a/LTWcyCx"></a> - просто ссылка на картинку
     *
     * <br>
     *
     * {@value #KEKE} - гиперссылка на ЗНАЧЕНИЕ константы
     *
     */
    public void links() {
    }

    /**
     * @see LinkPlain - какойто текст
     */
    public void see() {
    }

    /**
     * Методы или константы можно прикрепить гиперссылкой через хештег # (аналог точки по типу Class.method)
     * <p>
     * {@linkplain #see()}  метод void see через тег linkplain
     * <br>
     * {@linkplain org.baileyseye.constants.Constants.Strings#URL гиперссылка на константу из утиль класса}
     * <br>
     * {@linkplain LinkPlain#description ссылка на} константу из класса
     * <br>
     * {@linkplain LinkPlain#howToUse() ссылка на} метод из класса
     *
     * @see #see() метод void see через тег see
     */
    public void methods() {

    }

    /**
     * Исходя из информации {@linkplain #description описания} можно оформить сниппет кода
     * <pre>
     *     {@code
     *       for (int i = start; i <= start + 1; ++i
     *     }
     * </pre>
     * Нужно сделать так чтобы цикл был бесконечным
     *
     * @see Pre#createSnippet() - подробнее о сниппетах
     * @see <a href="https://imgur.com/a/LTWcyCx">Как выглядит это</a>
     */
    public void snippet() {
        //тут надо чтото написать
        for (int i = start; i <= start + 1; ++i) { //условия цикла менять нельзя
            // Тело цикла не изменяется
        }
    }

    String description = """
            Можно в джавадоке указать целый сниппет кода
            """;
}
