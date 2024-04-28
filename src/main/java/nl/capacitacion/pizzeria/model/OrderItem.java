package nl.capacitacion.pizzeria.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_item")
@IdClass(OrderItemId.class)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @Column(name = "id_order",nullable = false)
    private Integer idOrder;

    @Id
    @Column(name = "id_item",nullable = false)
    private Integer idItem;

    @Column(name = "id_pizza",nullable = false)
    private Integer idPizza;

    @Column(nullable = false,columnDefinition = "DECIMAL(2,1)")
    private Double quantity;

    @Column(nullable = false,columnDefinition = "DECIMAL(5,2)")
    private Double price;

    @OneToOne
    @JoinColumn(name = "id_pizza",referencedColumnName = "id_pizza",insertable = false,updatable = false)
    private Pizza pizza;

    @ManyToOne
    @JoinColumn(name = "id_order",referencedColumnName = "id_order",insertable = false,updatable = false)
    private Order order;
}
