package co.jp.api.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = Roles.TABLE_NAME)
@Getter
@Setter
public class Roles implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String TABLE_NAME = "roles";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "roles_name", nullable = false)
	private String rolesName;

	@Column(name = "roles_id", nullable = false)
	private Integer rolesId;

	@Column(name = "status", nullable = false)
	private Integer status;

	@ManyToMany(mappedBy = "rolesSet")
	private Set<User> users;
}
