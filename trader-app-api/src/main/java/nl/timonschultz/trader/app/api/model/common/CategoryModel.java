package nl.timonschultz.trader.app.api.model.common;

public class CategoryModel {

    private Long id;
    private String name;

    public CategoryModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
