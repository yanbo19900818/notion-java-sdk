package xyz.yanbo.notion.sdk.model.richtext;

import lombok.Data;

/**
 * Mention objects represent an inline mention of a user, page, database, or date. In the app these are created by typing @ followed by the name of a user, page, database, or a date.
 */
@Data
public class NotionEquationRichText extends NotionRichText {
    /**
     * The LaTeX string representing this inline equation.
     * example:"\frac{{ - b \pm \sqrt {b^2 - 4ac} }}{{2a}}"
     */
    private String expression;
}
