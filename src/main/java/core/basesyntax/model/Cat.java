package core.basesyntax.model;

/**
 * Represents a Cat with a name, age, and owner.
 */
public class Cat {
    private static final String SINGLE_QUOTE = "'";
    private static final String COMMA = ", ";

    private int age;
    private String name;
    private String ownerName;

    /**
     * Returns a string representation of this Cat in the format:
     * Cat{age=AGE, name='NAME', ownerName='OWNERNAME'}
     *
     * @return a string representation of the Cat
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cat{")
                .append("age=").append(age).append(COMMA)
                .append("name=").append(SINGLE_QUOTE).append(name).append(SINGLE_QUOTE)
                .append(COMMA)
                .append("ownerName=").append(SINGLE_QUOTE).append(ownerName).append(SINGLE_QUOTE)
                .append("}");
        return sb.toString();
    }
}
