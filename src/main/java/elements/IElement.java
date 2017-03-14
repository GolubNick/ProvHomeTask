package elements;

public interface IElement {

    default String getText(){return "";}

    default void click(){}

    default boolean isVisible(){return false;}


}
