package nl.timonschultz.trader.app.core.commodity.model;

import org.springframework.stereotype.Component;

@Component
public class CategoryServiceModel {

    private Long id;
    private String name;

    public CategoryServiceModel(Long id, String name) {
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
