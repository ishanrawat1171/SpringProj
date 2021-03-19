package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CoinRepository extends JpaRepository<Coin, Integer> {
	@Query("SELECT u FROM Coin u WHERE u.coinid = ?1")
	public User findByCoinId(int coinid);
	
}