package com.bcv.cusg.entities;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "sico", name = "pais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pais extends Base {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @Column(unique = true, nullable = false, length = 3)
    private Long coPais;

    @Column(nullable = false, length = 60)
    private String nbPais;

    @Column(nullable = true, length = 4)
    private Long coPaisSicap;

    @Column(nullable = false, length = 1)
    private String stPais;
   
    //@OneToMany(mappedBy = "coPais")
    //private Set<Sucursal> coPaisSucursals;
   
}

