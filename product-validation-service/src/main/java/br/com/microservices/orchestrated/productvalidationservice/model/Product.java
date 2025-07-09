package br.com.microservices.orchestrated.productvalidationservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TBL_PRODUCT")
public class Product {

    @Id
    @SequenceGenerator(name = "id", sequenceName = "seq_product")
    @GeneratedValue(generator = "seq_product", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name = "Marvin";

}
