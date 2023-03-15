package applaudo.nirivera.productservice.repository;

import applaudo.nirivera.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IProductRepository extends MongoRepository<Product, String> {
}
