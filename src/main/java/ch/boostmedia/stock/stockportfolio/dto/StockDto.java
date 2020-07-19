package ch.boostmedia.stock.stockportfolio.dto;

public class StockDto {
    private String name;

    public StockDto(String name) {
        this.name = name;
    }

    public StockDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StockDto{" +
                "name='" + name + '\'' +
                '}';
    }

}
