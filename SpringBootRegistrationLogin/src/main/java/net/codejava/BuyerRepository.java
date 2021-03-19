package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
	@Query("SELECT u FROM Buyer u WHERE u.buyerId = ?1")
	public Buyer findByBuyerId(int buyerId);
}