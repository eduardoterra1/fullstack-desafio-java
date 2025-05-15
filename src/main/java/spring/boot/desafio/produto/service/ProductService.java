package spring.boot.desafio.produto.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import spring.boot.desafio.produto.dto.ProductDTO;
import spring.boot.desafio.produto.pagination.PageResponse;
import spring.boot.desafio.produto.repository.ProductRepository;


@Service
@RequiredArgsConstructor
public class ProductService {
    
    private final ProductRepository repository;

    public PageResponse<ProductDTO> list(Pageable pageable){
        
        Pageable safe = PageRequest.of(
            pageable.getPageNumber(),
           Math.min(pageable.getPageSize(), 100)
        ); 

        return PageResponse.of(repository.findAll(safe).map(ProductDTO::from));

    }
}
