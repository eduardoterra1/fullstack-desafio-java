package spring.boot.desafio.produto.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import spring.boot.desafio.produto.dto.ProductDTO;
import spring.boot.desafio.produto.pagination.PageResponse;
import spring.boot.desafio.produto.service.ProductService;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {
    
    private final ProductService service;

    @GetMapping
    public PageResponse<ProductDTO> list(Pageable pageable) {
        return service.list(pageable);
    }
    

}
