package br.senac.rn.agenda.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contatos")
@Data
public class Contato {

    @Id
    @Column(name = "con_id")
    //@SequenceGenerator(name="tb_contatos_id_sequence", sequenceName="tb_contatos_id_sequence", allocationSize=1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "con_nome", nullable = false)
    private String nome;

    @Column(name = "con_fone", nullable = false)
    private String fone;

}
