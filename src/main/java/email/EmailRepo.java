package email;

import org.springframework.data.repository.CrudRepository;

public interface EmailRepo extends CrudRepository<EmailEntity,String> {

}
