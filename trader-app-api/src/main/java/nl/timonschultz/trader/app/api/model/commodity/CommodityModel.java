package nl.timonschultz.trader.app.api.model.commodity;

import nl.timonschultz.trader.app.api.model.common.CategoryModel;

public class CommodityModel {

    private Long id;
    private String name;
    private Long categoryId;
    private int averagePrice;
    private boolean isRare;
    private int maxBuyPrice;
    private int maxSellPrice;
    private int minBuyPrice;
    private int minSellPrice;
    private int buyPriceLowerAverage;
    private int sellPriceUpperAverage;
    private boolean isNonMarketable;
    private Long edId;
    private CategoryModel category;

    public CommodityModel(Long id,
                          String name,
                          Long categoryId,
                          int averagePrice,
                          int isRare,
                          int maxBuyPrice,
                          int maxSellPrice,
                          int minBuyPrice,
                          int minSellPrice,
                          int buyPriceLowerAverage,
                          int sellPriceUpperAverage,
                          int isNonMarketable,
                          Long edId,
                          CategoryModel category) {

        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
        this.averagePrice = averagePrice;
        this.isRare = isRare == 1;
        this.maxBuyPrice = maxBuyPrice;
        this.maxSellPrice = maxSellPrice;
        this.minBuyPrice = minBuyPrice;
        this.minSellPrice = minSellPrice;
        this.buyPriceLowerAverage = buyPriceLowerAverage;
        this.sellPriceUpperAverage = sellPriceUpperAverage;
        this.isNonMarketable = isNonMarketable == 1;
        this.edId = edId;
        this.category = category;
    }


}
