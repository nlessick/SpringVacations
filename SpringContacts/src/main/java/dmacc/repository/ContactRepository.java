package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Contact;

/**
 * @author {Nathaniel Essick} - nlessick
 * CIS175 - Spring 2021
 * {3/17/2021}
 */
@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{ 

}
