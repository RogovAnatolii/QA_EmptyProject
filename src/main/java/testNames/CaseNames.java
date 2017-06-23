package testNames;

/**
 * Created by AnatolyRogov on 18.06.17.
 */
public enum  CaseNames {
    CN_000("Залогиниться на сайте vk.com"),
    CN_001("Отправить сообщение пользователю"),
    CN_002("Отправить сообщение пользователю. Негативный")
    ;

    final private String name;

    CaseNames(final String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
