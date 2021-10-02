package email;



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
@Table(name="email")
public class EmailEntity {
	
	@Id
	@Column(name="title")
	private String title;
	@Column(name="sender_name")
	private String sendername;
	@Column(name="reciver_name")
	private String recivername;
	@Column(name="body")
	private String body;


}
