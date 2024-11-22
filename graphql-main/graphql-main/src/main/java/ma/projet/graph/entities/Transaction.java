package ma.projet.graph.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TypeTransaction type;

    private double montant;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTransaction;
    @ManyToOne
    private Compte compte;
}
