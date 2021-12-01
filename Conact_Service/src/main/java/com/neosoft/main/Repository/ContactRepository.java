package com.neosoft.main.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.neosoft.main.Model.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, Long>{

	@Query("{userId:?0}")
	public List<Contact> findByUserId(Long userId);
}
