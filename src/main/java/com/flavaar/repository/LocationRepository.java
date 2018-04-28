package com.flavaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavaar.model.Location;

public interface LocationRepository extends JpaRepository<Location, String> {
	
	/*@Query("select * from Product where productDescription like %:key%")
	public List<Product> getSelectedProd(@Param("key") String key);
*/
}
