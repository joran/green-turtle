package se.js.greenturtle;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

//RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface AccountRepository extends PagingAndSortingRepository<Account,Long>{
	List<Account> findByUid(@Param("uid") String uid);
}
