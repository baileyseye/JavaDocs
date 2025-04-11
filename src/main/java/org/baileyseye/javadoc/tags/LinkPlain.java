package org.baileyseye.javadoc.tags;

/**
 * Гиперссылка {@linkplain LinkPlain linkplain}
 *
 * @see #description
 */
public class LinkPlain {

    /**
     * Описание
     *
     * @see #howToUse()
     */
    public String description = """
            Создает гиперссылку на класс или метод или константу.
            """;

    /**
     * {@linkplain LinkPlain}
     */
    public String usageOne = """
            Можно передать класс гиперссылкой как {@linkplain Class}. В таком случае гиперссылка будет на "Class".
            """;

    /**
     * {@linkplain LinkPlain свой текст}
     */
    public String usageTwo = """
            Можно передать свой текст в гиперссылку после класса.
            В таком случае гиперссылка будет на "свой текст"
            """;

    /**
     * Для простого понимания какой класс используется подойдет {@linkplain #usageOne}
     * <br>
     * В случае необходимости дополнительных комментариев подойдет {@linkplain #usageTwo}
     */
    public void howToUse() {
    }
}
