package com.picpaysimplificado.domain.user;

import jakarta.persistence.Entity;
import jakarta.persistence.table;
@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllAgrsConstructor
@EqualsAndHashCode(of="id")

public class User {
}
