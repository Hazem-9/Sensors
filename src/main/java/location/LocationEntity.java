package location;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="location")
public class LocationEntity {
	
	
	@Id
	@Column(name="code")
	private String LocationCode;
	@Column(name="state")
	private int LocationState;

}
