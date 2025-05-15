package spring.boot.desafio.produto.dto;

import java.math.BigDecimal;

import spring.boot.desafio.produto.model.Product;

public record ProductDTO(
    String name,
    BigDecimal price
) {
   public static ProductDTO from (Product p){
        return new ProductDTO(p.getName(), p.getPrice());
   }
}
