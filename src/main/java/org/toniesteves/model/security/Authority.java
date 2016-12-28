package org.toniesteves.model.security;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.toniesteves.model.Purchase;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
public @Data class Authority {

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private List<Login> users;

}