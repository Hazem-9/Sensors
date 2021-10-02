package sensors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name="sensor")
public class SensorsTypes {
	
	
	@Id
	@Column(name="humidity_sensor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String Humidity;
	@Column(name="light_sensor")
	private float Light;
	@Column(name="temperature")
	private float Temperature;


}
