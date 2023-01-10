package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="searchProducts", path="searchProducts")
public interface SearchProductRepository extends PagingAndSortingRepository<SearchProduct, Long> {

    

    
}
