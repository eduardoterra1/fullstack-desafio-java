package spring.boot.desafio.produto.pagination;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

import org.springframework.data.domain.Page;

public record PageResponse<T>(
   @JsonProperty ("items") List<T> content, 
   int page,
   int size, 
   long totalElement,
   boolean hasNext
) {
    public static<T> PageResponse<T> of (Page<T> page){
        return new PageResponse<>(
            page.getContent(),
            page.getNumber(),
            page.getSize(),
            page.getTotalPages(),
            page.hasNext()
        );
    }   
}
